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
