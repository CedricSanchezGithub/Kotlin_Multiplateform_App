🇫🇷 L'installeur multiplateforme étant assez limité pour l'instant, j'ai tenté d'en configurer un pour pouvoir démarrer un projet rapidement. J'apprends encore, donc toute remarque est la bienvenue. Il manque aussi certainement des implémentations de base.

🇬🇧 As the multiplatform installer is quite limited at the moment, I've attempted to configure one to be able to start a project quickly. I'm still learning, so any feedback is welcome. There are certainly also some basic implementations missing.

jvmTarget = "17"
Compose multiplatform

rootProject.name = "Kotlin_Multiplatform_App"
include(":androidApp")
include(":shared:datas")
include(":shared:domain")
include(":shared:presentation")

kotlin.native.ignoreDisabledTargets=true
kotmin.mpp.androidGradlePluginCompatibility.nowarn=true

