plugins {
    id("com.github.minigdx.gradle.plugin.developer.mpp")
}

dependencies {
    jvmMainImplementation("org.jetbrains.kotlin:kotlin-stdlib")

    jvmMainImplementation(libs.org.jogamp.gluegen.rt)
    jvmMainImplementation(libs.org.jogamp.jogl.all)

    jvmMainImplementation(project(":kgl"))
}
