plugins {
    id("com.github.minigdx.gradle.plugin.developer.mpp")
}

dependencies {
    jvmMainImplementation(libs.org.lwjgl)
    jvmMainImplementation(libs.org.lwjgl.assimp)
    jvmMainImplementation(libs.org.lwjgl.glfw)
    jvmMainImplementation(libs.org.lwjgl.openal)
    jvmMainImplementation(libs.org.lwjgl.opengl)
    jvmMainImplementation(libs.org.lwjgl.stb)

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
