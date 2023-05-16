plugins {
    id("com.github.minigdx.gradle.plugin.developer.mpp")
}

val lwjglVersion = "3.3.1"

dependencies {
    jvmMainImplementation("org.lwjgl:lwjgl:$lwjglVersion")
    jvmMainImplementation("org.lwjgl:lwjgl-assimp:$lwjglVersion")
    jvmMainImplementation("org.lwjgl:lwjgl-glfw:$lwjglVersion")
    jvmMainImplementation("org.lwjgl:lwjgl-openal:$lwjglVersion")
    jvmMainImplementation("org.lwjgl:lwjgl-opengl:$lwjglVersion")
    jvmMainImplementation("org.lwjgl:lwjgl-stb:$lwjglVersion")

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
