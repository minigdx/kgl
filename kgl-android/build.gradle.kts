plugins {
    id("com.android.library")
    id("com.github.minigdx.gradle.plugin.developer.mpp")
}

android {
    compileSdk = 33

    namespace = "com.danielgergely.kgl_android"

    defaultConfig {
        minSdk = 21
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    androidMainImplementation(project(":kgl"))
}

minigdxDeveloper {
    this.name.set("kgl")
    this.description.set("Lightweight OpenGL abstraction for Kotlin Multiplatform (fork of https://github.com/gergelydaniel/kgl)")
    this.projectUrl.set("https://github.com/minigdx/kgl")
    this.licence {
        name.set("MIT Licence")
        url.set("https://github.com/minigdx/kgl/blob/main/LICENSE")
    }
    developer {
        name.set("Daniel Gergely")
        url.set("https://github.com/gergelydaniel")
    }
    developer {
        name.set("David Wursteisen")
        email.set("david.wursteisen+minigdx@gmail.com")
        url.set("https://github.com/dwursteisen")
    }
}
