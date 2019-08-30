/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/checkLocalVariablesTable")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CheckLocalVariablesTableTestGenerated extends AbstractCheckLocalVariablesTableTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM, testDataFilePath);
    }

    public void testAllFilesPresentInCheckLocalVariablesTable() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/checkLocalVariablesTable"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JVM, true);
    }

    @TestMetadata("catchClause.kt")
    public void testCatchClause() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/catchClause.kt");
    }

    @TestMetadata("copyFunction.kt")
    public void testCopyFunction() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/copyFunction.kt");
    }

    @TestMetadata("destructuringInLambdas.kt")
    public void testDestructuringInLambdas() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/destructuringInLambdas.kt");
    }

    @TestMetadata("destructuringInlineLambda.kt")
    public void testDestructuringInlineLambda() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/destructuringInlineLambda.kt");
    }

    @TestMetadata("inlineLambdaWithItParam.kt")
    public void testInlineLambdaWithItParam() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/inlineLambdaWithItParam.kt");
    }

    @TestMetadata("inlineLambdaWithParam.kt")
    public void testInlineLambdaWithParam() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/inlineLambdaWithParam.kt");
    }

    @TestMetadata("inlineProperty.kt")
    public void testInlineProperty() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/inlineProperty.kt");
    }

    @TestMetadata("inlineSimple.kt")
    public void testInlineSimple() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/inlineSimple.kt");
    }

    @TestMetadata("inlineSimpleChain.kt")
    public void testInlineSimpleChain() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/inlineSimpleChain.kt");
    }

    @TestMetadata("itInLambda.kt")
    public void testItInLambda() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/itInLambda.kt");
    }

    @TestMetadata("itInReturnedLambda.kt")
    public void testItInReturnedLambda() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/itInReturnedLambda.kt");
    }

    @TestMetadata("jvmOverloads.kt")
    public void testJvmOverloads() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/jvmOverloads.kt");
    }

    @TestMetadata("kt11117.kt")
    public void testKt11117() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/kt11117.kt");
    }

    @TestMetadata("lambdaAsVar.kt")
    public void testLambdaAsVar() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/lambdaAsVar.kt");
    }

    @TestMetadata("localFun.kt")
    public void testLocalFun() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/localFun.kt");
    }

    @TestMetadata("receiverParameter.kt")
    public void testReceiverParameter() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/receiverParameter.kt");
    }

    @TestMetadata("underscoreNames.kt")
    public void testUnderscoreNames() throws Exception {
        runTest("compiler/testData/checkLocalVariablesTable/underscoreNames.kt");
    }

    @TestMetadata("compiler/testData/checkLocalVariablesTable/completionInSuspendFunction")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CompletionInSuspendFunction extends AbstractCheckLocalVariablesTableTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM, testDataFilePath);
        }

        public void testAllFilesPresentInCompletionInSuspendFunction() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/checkLocalVariablesTable/completionInSuspendFunction"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JVM, true);
        }

        @TestMetadata("nonStaticSimple.kt")
        public void testNonStaticSimple() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/completionInSuspendFunction/nonStaticSimple.kt");
        }

        @TestMetadata("nonStaticStateMachine.kt")
        public void testNonStaticStateMachine() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/completionInSuspendFunction/nonStaticStateMachine.kt");
        }

        @TestMetadata("staticSimple.kt")
        public void testStaticSimple() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/completionInSuspendFunction/staticSimple.kt");
        }

        @TestMetadata("staticSimpleReceiver.kt")
        public void testStaticSimpleReceiver() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/completionInSuspendFunction/staticSimpleReceiver.kt");
        }

        @TestMetadata("staticStateMachine.kt")
        public void testStaticStateMachine() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/completionInSuspendFunction/staticStateMachine.kt");
        }

        @TestMetadata("staticStateMachineReceiver.kt")
        public void testStaticStateMachineReceiver() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/completionInSuspendFunction/staticStateMachineReceiver.kt");
        }
    }

    @TestMetadata("compiler/testData/checkLocalVariablesTable/parametersInSuspendLambda")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ParametersInSuspendLambda extends AbstractCheckLocalVariablesTableTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM, testDataFilePath);
        }

        public void testAllFilesPresentInParametersInSuspendLambda() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/checkLocalVariablesTable/parametersInSuspendLambda"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JVM, true);
        }

        @TestMetadata("dataClass.kt")
        public void testDataClass() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/parametersInSuspendLambda/dataClass.kt");
        }

        @TestMetadata("extensionComponents.kt")
        public void testExtensionComponents() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/parametersInSuspendLambda/extensionComponents.kt");
        }

        @TestMetadata("generic.kt")
        public void testGeneric() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/parametersInSuspendLambda/generic.kt");
        }

        @TestMetadata("inline.kt")
        public void testInline() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/parametersInSuspendLambda/inline.kt");
        }

        @TestMetadata("otherParameters.kt")
        public void testOtherParameters() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/parametersInSuspendLambda/otherParameters.kt");
        }

        @TestMetadata("parameters.kt")
        public void testParameters() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/parametersInSuspendLambda/parameters.kt");
        }

        @TestMetadata("underscoreNames.kt")
        public void testUnderscoreNames() throws Exception {
            runTest("compiler/testData/checkLocalVariablesTable/parametersInSuspendLambda/underscoreNames.kt");
        }
    }
}
