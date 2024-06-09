plugins {
    kotlin("jvm") version "1.8.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("MinETMax_MavenKt")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

kotlin {
    jvmToolchain {
        (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(17))
    }
}

// Ajoutez cette section pour vous assurer que l'application s'exécute dans un terminal interactif
tasks.withType<JavaExec> {
    standardInput = System.`in`
}
