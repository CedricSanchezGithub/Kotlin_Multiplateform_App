jvmToolchain(17)
Compose multiplatform

rootProject.name = "Kotlin_Multiplatform_App"

include(":androidApp")  
include(":shared:datas")  
include(":shared:domain")  
include(":shared:presentation")  

kotlin.native.ignoreDisabledTargets=true  
kotmin.mpp.androidGradlePluginCompatibility.nowarn=true  

