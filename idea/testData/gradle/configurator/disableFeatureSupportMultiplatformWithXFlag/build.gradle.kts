buildscript {
    repositories {
        jcenter()
        mavenCentral()
        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-dev") }
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50-eap-2")
    }
}
apply(plugin="kotlin-multiplatform")
repositories {
    jcenter()
    mavenCentral()
}