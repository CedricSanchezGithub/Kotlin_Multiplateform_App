enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Kotlin_Multiplatform_App"
include(":androidApp")
include(":iosApp")
include(":shared:datas")
include(":shared:domain")
include(":shared:presentation")