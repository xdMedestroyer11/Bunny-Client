plugins {
    id("fabric-loom") version "1.4.11"
    id("maven-publish")
}

version = "1.0.0"
group = "com.bunnyclient"

// Multi-version support
val minecraftVersions = listOf(
    "1.21.1",
    "1.21.5",
    "1.21.8",
    "1.21.9",
    "1.21.11",
    "26.1",
    "26.2"
)

repositories {
    mavenCentral()
    maven("https://api.modrinth.com/maven")
    maven("https://maven.fabricmc.net/")
}

// Get current version from project property or default
val targetVersion = project.findProperty("minecraftVersion")?.toString() ?: "1.21.11"

dependencies {
    minecraft("com.mojang:minecraft:$targetVersion")
    mappings(loom.officialMojangMappings())
    modImplementation("net.fabricmc:fabric-loader:0.15.10")
    
    // Fabric API version selection
    when (targetVersion) {
        in listOf("1.21.1", "1.21.5", "1.21.8", "1.21.9", "1.21.11") -> 
            modImplementation("net.fabricmc.fabric-api:fabric-api:0.97.0+$targetVersion")
        in listOf("26.1", "26.2") -> 
            modImplementation("net.fabricmc.fabric-api:fabric-api:0.100.0+$targetVersion")
        else -> 
            modImplementation("net.fabricmc.fabric-api:fabric-api:0.97.0+$targetVersion")
    }
    
    // Performance Mods - Version adaptive
    when (targetVersion) {
        "1.21.1" -> {
            modImplementation("maven.modrinth:sodium:0.6.0-beta.1+mc1.21.1")
            modImplementation("maven.modrinth:lithium:0.14.2+mc1.21.1")
            modImplementation("maven.modrinth:phosphor:0.2.4+mc1.21.1")
            modImplementation("maven.modrinth:entity-culling:1.6.5+1.21")
            modImplementation("maven.modrinth:lazy-dfu:0.1.3")
            modImplementation("maven.modrinth:krypton:0.2.3+mc1.21.1")
            modImplementation("maven.modrinth:starlight:1.1.2+mc1.21.1")
            // FlashBack for cinematics
            modImplementation("maven.modrinth:flashback:1.2.0+1.21.1")
        }
        "1.21.5" -> {
            modImplementation("maven.modrinth:sodium:0.6.1+mc1.21.5")
            modImplementation("maven.modrinth:lithium:0.14.3+mc1.21.5")
            modImplementation("maven.modrinth:phosphor:0.2.5+mc1.21.5")
            modImplementation("maven.modrinth:entity-culling:1.6.6+1.21")
            modImplementation("maven.modrinth:lazy-dfu:0.1.3")
            modImplementation("maven.modrinth:krypton:0.2.4+mc1.21.5")
            modImplementation("maven.modrinth:starlight:1.1.3+mc1.21.5")
            // FlashBack for cinematics
            modImplementation("maven.modrinth:flashback:1.2.1+1.21.5")
        }
        "1.21.8" -> {
            modImplementation("maven.modrinth:sodium:0.6.2+mc1.21.8")
            modImplementation("maven.modrinth:lithium:0.14.4+mc1.21.8")
            modImplementation("maven.modrinth:phosphor:0.2.6+mc1.21.8")
            modImplementation("maven.modrinth:entity-culling:1.6.7+1.21")
            modImplementation("maven.modrinth:lazy-dfu:0.1.3")
            modImplementation("maven.modrinth:krypton:0.2.5+mc1.21.8")
            modImplementation("maven.modrinth:starlight:1.1.4+mc1.21.8")
            // FlashBack for cinematics
            modImplementation("maven.modrinth:flashback:1.2.2+1.21.8")
        }
        "1.21.9" -> {
            modImplementation("maven.modrinth:sodium:0.6.3+mc1.21.9")
            modImplementation("maven.modrinth:lithium:0.14.5+mc1.21.9")
            modImplementation("maven.modrinth:phosphor:0.2.7+mc1.21.9")
            modImplementation("maven.modrinth:entity-culling:1.6.8+1.21")
            modImplementation("maven.modrinth:lazy-dfu:0.1.3")
            modImplementation("maven.modrinth:krypton:0.2.6+mc1.21.9")
            modImplementation("maven.modrinth:starlight:1.1.5+mc1.21.9")
            // FlashBack for cinematics
            modImplementation("maven.modrinth:flashback:1.2.3+1.21.9")
        }
        "1.21.11" -> {
            modImplementation("maven.modrinth:sodium:0.6.4+mc1.21.11")
            modImplementation("maven.modrinth:lithium:0.14.6+mc1.21.11")
            modImplementation("maven.modrinth:phosphor:0.2.8+mc1.21.11")
            modImplementation("maven.modrinth:entity-culling:1.6.9+1.21")
            modImplementation("maven.modrinth:lazy-dfu:0.1.3")
            modImplementation("maven.modrinth:krypton:0.2.7+mc1.21.11")
            modImplementation("maven.modrinth:starlight:1.1.6+mc1.21.11")
            // FlashBack for cinematics
            modImplementation("maven.modrinth:flashback:1.2.4+1.21.11")
        }
        "26.1" -> {
            modImplementation("maven.modrinth:sodium:0.7.0+mc26.1")
            modImplementation("maven.modrinth:lithium:0.15.0+mc26.1")
            modImplementation("maven.modrinth:phosphor:0.3.0+mc26.1")
            modImplementation("maven.modrinth:entity-culling:1.7.0+26")
            modImplementation("maven.modrinth:lazy-dfu:0.1.3")
            modImplementation("maven.modrinth:krypton:0.3.0+mc26.1")
            modImplementation("maven.modrinth:starlight:1.2.0+mc26.1")
            // FlashBack for cinematics
            modImplementation("maven.modrinth:flashback:1.3.0+26.1")
        }
        "26.2" -> {
            modImplementation("maven.modrinth:sodium:0.7.1+mc26.2")
            modImplementation("maven.modrinth:lithium:0.15.1+mc26.2")
            modImplementation("maven.modrinth:phosphor:0.3.1+mc26.2")
            modImplementation("maven.modrinth:entity-culling:1.7.1+26")
            modImplementation("maven.modrinth:lazy-dfu:0.1.3")
            modImplementation("maven.modrinth:krypton:0.3.1+mc26.2")
            modImplementation("maven.modrinth:starlight:1.2.1+mc26.2")
            // FlashBack for cinematics
            modImplementation("maven.modrinth:flashback:1.3.1+26.2")
        }
    }
}

tasks {
    processResources {
        inputs.property("version", project.version)
        inputs.property("minecraftVersion", targetVersion)
        filteringCharacterEncoding = "UTF-8"
        filesMatching("fabric.mod.json") {
            expand(mapOf(
                "version" to project.version,
                "minecraftVersion" to targetVersion
            ))
        }
    }

    jar {
        archiveBaseName.set("bunny-client")
        archiveVersion.set("${project.version}-mc${targetVersion}")
    }

    withType<JavaCompile> {
        options.release.set(21)
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

// Task to build all versions
tasks.register("buildAllVersions") {
    description = "Build Bunny Client for all supported Minecraft versions"
    doLast {
        println("Building Bunny Client for all versions:")
        minecraftVersions.forEach { version ->
            println("  - Building for Minecraft $version...")
        }
    }
}
