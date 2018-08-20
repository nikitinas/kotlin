/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.file.FileCollection
import org.gradle.api.plugins.JavaPluginConvention
import org.gradle.api.tasks.*
import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.utils.isClassFile
import java.io.File

internal open class InspectClassesForMultiModuleIC : DefaultTask() {
    @get:Internal
    lateinit var jarTask: Jar

    @get:Input
    lateinit var sourceSetName: String

    @Suppress("MemberVisibilityCanBePrivate")
    @get:OutputFile
    internal val classesListFile: File
        get() = File(File(project.buildDir, KOTLIN_BUILD_DIR_NAME), "${sanitizeFileName(jarTask.archiveName)}-classes.txt")

    @Suppress("MemberVisibilityCanBePrivate")
    @get:InputFiles
    internal val classFiles: FileCollection
        get() = project.convention.findPlugin(JavaPluginConvention::class.java)?.let {
            it.sourceSets.findByName(sourceSetName)?.output?.asFileTree?.filter { it.isClassFile() }
        } ?: project.files()

    @get:Input
    internal val archivePath: String
        get() = jarTask.archivePath.canonicalPath

    @TaskAction
    fun run() {
        classesListFile.parentFile.mkdirs()
        val text = classFiles.map { it.absolutePath }.sorted().joinToString(File.pathSeparator)
        classesListFile.writeText(text)
    }

    private fun sanitizeFileName(candidate: String): String =
        candidate.filter { it.isLetterOrDigit() }
}