plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.jetbrainsCompose)

}

kotlin {
    kotlin {
        androidTarget()
        jvmToolchain(17)
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    )

    sourceSets {
        commonMain.dependencies {
            implementation(project(":shared:domain"))
            implementation(compose.ui)
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.components.resources)
            implementation(libs.androidx.navigation.compose)
            implementation(libs.androidx.runtime)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        androidMain.dependencies {
            implementation(libs.androidx.runtime.android)
            implementation(libs.lifecycle.viewmodel.android)
            implementation(libs.kotlinx.couroutines.android)
            implementation(libs.androidx.core.ktx)
        }
    }
}

android {
    namespace = "com.example.kotlinmultiplatformapp.presentation"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}