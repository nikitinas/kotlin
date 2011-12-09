package org.jetbrains.jet.lang.resolve;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.Configuration;
import org.jetbrains.jet.lang.JetSemanticServices;
import org.jetbrains.jet.lang.cfg.pseudocode.JetControlFlowDataTraceFactory;
import org.jetbrains.jet.lang.descriptors.*;
import org.jetbrains.jet.lang.psi.JetDeclaration;
import org.jetbrains.jet.lang.psi.JetNamespace;
import org.jetbrains.jet.lang.psi.JetObjectDeclaration;
import org.jetbrains.jet.lang.resolve.scopes.JetScope;
import org.jetbrains.jet.lang.resolve.scopes.WritableScope;

import java.util.Collection;
import java.util.Collections;

/**
 * @author abreslav
 */
public class TopDownAnalyzer {

    private TopDownAnalyzer() {}

    public static void process(
            @NotNull JetSemanticServices semanticServices,
            @NotNull BindingTrace trace,
            @NotNull JetScope outerScope,
            @NotNull NamespaceLike owner,
            @NotNull Collection<? extends JetDeclaration> declarations,
            @NotNull Predicate<PsiFile> analyzeCompletely,
            @NotNull JetControlFlowDataTraceFactory flowDataTraceFactory,
            @NotNull Configuration configuration
            ) {
        process(semanticServices, trace, outerScope, owner, declarations, analyzeCompletely, flowDataTraceFactory, configuration, false);
    }

    private static void process(
            @NotNull JetSemanticServices semanticServices,
            @NotNull BindingTrace trace,
            @NotNull JetScope outerScope,
            @NotNull NamespaceLike owner,
            @NotNull Collection<? extends JetDeclaration> declarations,
            @NotNull Predicate<PsiFile> analyzeCompletely,
            @NotNull JetControlFlowDataTraceFactory flowDataTraceFactory,
            @NotNull Configuration configuration,
            boolean declaredLocally) {
        TopDownAnalysisContext context = new TopDownAnalysisContext(semanticServices, trace, analyzeCompletely, configuration, declaredLocally);
        doProcess(context, outerScope, owner, declarations, flowDataTraceFactory);

    }

    private static void doProcess(
            TopDownAnalysisContext context, JetScope outerScope,
            NamespaceLike owner,
            Collection<? extends JetDeclaration> declarations,
            JetControlFlowDataTraceFactory flowDataTraceFactory) {
//        context.enableDebugOutput();
        context.debug("Enter");

        new TypeHierarchyResolver(context).process(outerScope, owner, declarations);
        new DeclarationResolver(context).process();
        new DelegationResolver(context).process();
        lockScopes(context);
        new OverrideResolver(context).process();
        new OverloadResolver(context).process();
        if (!context.analyzingBootstrapLibrary()) {
            new BodyResolver(context).resolveBehaviorDeclarationBodies();
            new ControlFlowAnalyzer(context, flowDataTraceFactory).process();
            new DeclarationsChecker(context).process();
        }

        context.debug("Exit");
        context.printDebugOutput(System.out);
    }

    private static void lockScopes(TopDownAnalysisContext context) {
        for (MutableClassDescriptor mutableClassDescriptor : context.getClasses().values()) {
            mutableClassDescriptor.lockScopes();
        }
        for (MutableClassDescriptor mutableClassDescriptor : context.getObjects().values()) {
            mutableClassDescriptor.lockScopes();
        }
        for (WritableScope namespaceScope : context.getNamespaceScopes().values()) {
            namespaceScope.changeLockLevel(WritableScope.LockLevel.READING);
        }
    }

    public static void processStandardLibraryNamespace(
            @NotNull JetSemanticServices semanticServices,
            @NotNull BindingTrace trace,
            @NotNull WritableScope outerScope, @NotNull NamespaceDescriptorImpl standardLibraryNamespace, @NotNull JetNamespace namespace) {
        TopDownAnalysisContext context = new TopDownAnalysisContext(semanticServices, trace, Predicates.<PsiFile>alwaysTrue(), Configuration.EMPTY, false);
        context.getNamespaceScopes().put(namespace, standardLibraryNamespace.getMemberScope());
        context.getNamespaceDescriptors().put(namespace, standardLibraryNamespace);
        context.getDeclaringScopes().put(namespace, outerScope);
        context.setAnalyzingBootstrapLibrary(true);

        doProcess(context, outerScope, standardLibraryNamespace, namespace.getDeclarations(), JetControlFlowDataTraceFactory.EMPTY);
    }

    public static void processObject(
            @NotNull JetSemanticServices semanticServices,
            @NotNull BindingTrace trace,
            @NotNull JetScope outerScope,
            @NotNull DeclarationDescriptor containingDeclaration,
            @NotNull JetObjectDeclaration object) {
        process(semanticServices, trace, outerScope, new NamespaceLike.Adapter(containingDeclaration) {

            @Override
            public NamespaceDescriptorImpl getNamespace(String name) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void addNamespace(@NotNull NamespaceDescriptor namespaceDescriptor) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void addClassifierDescriptor(@NotNull MutableClassDescriptor classDescriptor) {

            }

            @Override
            public void addFunctionDescriptor(@NotNull FunctionDescriptor functionDescriptor) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void addPropertyDescriptor(@NotNull PropertyDescriptor propertyDescriptor) {

            }

            @Override
            public ClassObjectStatus setClassObjectDescriptor(@NotNull MutableClassDescriptor classObjectDescriptor) {
                return ClassObjectStatus.NOT_ALLOWED;
            }
        }, Collections.<JetDeclaration>singletonList(object), Predicates.equalTo(object.getContainingFile()), JetControlFlowDataTraceFactory.EMPTY, Configuration.EMPTY, true);
    }

}


