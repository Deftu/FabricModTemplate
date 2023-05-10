plugins {
    java
    kotlin("jvm")
    id("xyz.deftu.gradle.multiversion")
    id("xyz.deftu.gradle.tools")
    id("xyz.deftu.gradle.tools.blossom")
    id("xyz.deftu.gradle.tools.minecraft.loom")
}

repositories {
    maven("https://maven.terraformersmc.com/")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    modImplementation("net.fabricmc.fabric-api:fabric-api:${mcData.fabricApiVersion}")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.8.6+kotlin.1.7.21")

    modImplementation("com.terraformersmc:modmenu:${when (mcData.version) {
        11904 -> "6.2.2"
        11903 -> "5.0.2"
        11902 -> "4.1.2"
        11802 -> "3.2.5"
        else -> throw IllegalStateException("Invalid MC version: ${mcData.version}")
    }}")
}
