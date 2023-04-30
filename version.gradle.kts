plugins {
    java
    kotlin("jvm")
    id("xyz.deftu.gradle.multiversion")
    id("xyz.deftu.gradle.tools")
    id("xyz.deftu.gradle.tools.minecraft.loom")
}

repositories {
    maven("https://maven.terraformersmc.com/")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    modImplementation("net.fabricmc.fabric-api:fabric-api:${when (mcData.version) {
        11903 -> "0.76.1+1.19.3"
        11902 -> "0.76.0+1.19.2"
        11802 -> "0.76.0+1.18.2"
        else -> throw IllegalStateException("Invalid MC version: ${mcData.version}")
    }}")

    modImplementation("net.fabricmc:fabric-language-kotlin:1.8.6+kotlin.1.7.21")

    modImplementation("com.terraformersmc:modmenu:${when (mcData.version) {
        11903 -> "5.0.2"
        11902 -> "4.1.2"
        11802 -> "3.2.5"
        else -> throw IllegalStateException("Invalid MC version: ${mcData.version}")
    }}")
}
