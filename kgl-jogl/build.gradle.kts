plugins {
    id("com.github.minigdx.gradle.plugin.developer.mpp")
}

dependencies {
    jvmMainImplementation("org.jetbrains.kotlin:kotlin-stdlib")

    jvmMainImplementation("org.jogamp.gluegen:gluegen-rt:2.3.2")
    jvmMainImplementation("org.jogamp.jogl:jogl-all:2.3.2")

    jvmMainImplementation(project(":kgl"))
}
