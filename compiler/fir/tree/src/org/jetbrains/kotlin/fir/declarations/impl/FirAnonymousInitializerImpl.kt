/*
 * Copyright 2000-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.declarations.impl

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.fir.FirAbstractElement
import org.jetbrains.kotlin.fir.FirElement
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.declarations.FirAnonymousInitializer
import org.jetbrains.kotlin.fir.declarations.FirResolvePhase
import org.jetbrains.kotlin.fir.expressions.FirBlock
import org.jetbrains.kotlin.fir.transformSingle
import org.jetbrains.kotlin.fir.visitors.FirTransformer

class FirAnonymousInitializerImpl(
    override val session: FirSession,
    psi: PsiElement?,
    override var body: FirBlock?
) : FirAnonymousInitializer, FirAbstractElement(psi) {
    override var resolvePhase = FirResolvePhase.RAW_FIR

    override fun <D> transformChildren(transformer: FirTransformer<D>, data: D): FirElement {
        body = body?.transformSingle(transformer, data)
        return this
    }
}