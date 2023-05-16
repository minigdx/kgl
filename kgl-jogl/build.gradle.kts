plugins {
    id("com.github.minigdx.gradle.plugin.developer.mpp")
}

dependencies {
    jvmMainImplementation("org.jetbrains.kotlin:kotlin-stdlib")

    jvmMainImplementation("org.jogamp.gluegen:gluegen-rt:2.3.2")
    jvmMainImplementation("org.jogamp.jogl:jogl-all:2.3.2")

    jvmMainImplementation(project(":kgl"))
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
