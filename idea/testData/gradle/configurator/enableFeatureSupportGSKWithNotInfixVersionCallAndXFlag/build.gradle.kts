import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.50-eap-5")
}

repositories {
    mavenCentral()
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    freeCompilerArgs = listOf("-Xinline-classes")
}