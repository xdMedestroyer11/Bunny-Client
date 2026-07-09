plugins {
    id("fabric-loom") version "1.4.11"
    id("maven-publish")
}

version = "1.0.0"
group = "com.bunnyclient"

repositories {
    mavenCentral()
    maven("https://api.modrinth.com/maven")
    maven("https://maven.fabricmc.net/")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.1")
    mappings(loom.officialMojangMappings())
    modImplementation("net.fabricmc:fabric-loader:0.15.10")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.97.0+1.21.1")
    
    // Performance Mods
    modImplementation("maven.modrinth:sodium:0.6.0-beta.1+mc1.21.1")
    modImplementation("maven.modrinth:lithium:0.14.2+mc1.21.1")
    modImplementation("maven.modrinth:phosphor:0.2.4+mc1.21.1")
    modImplementation("maven.modrinth:entity-culling:1.6.5+1.21")
    modImplementation("maven.modrinth:lazy-dfu:0.1.3")
    modImplementation("maven.modrinth:krypton:0.2.3+mc1.21.1")
    modImplementation("maven.modrinth:starlight:1.1.2+mc1.21.1")
}

tasks {
    processResources {
        inputs.property("version", project.version)
        filteringCharacterEncoding = "UTF-8"
        filesMatching("fabric.mod.json") {
            expand(mapOf("version" to project.version))
        }
    }

    withType<JavaCompile> {
        options.release.set(21)
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}
