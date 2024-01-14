plugins {
    id("com.github.minigdx.gradle.plugin.developer.mpp") version "DEV-SNAPSHOT" apply false
    id("com.github.minigdx.gradle.plugin.developer") version "DEV-SNAPSHOT"
    id("com.android.library") version "8.2.1" apply false
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
