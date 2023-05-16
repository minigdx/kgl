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
