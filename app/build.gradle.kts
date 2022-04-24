plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.6.21"

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.21")
}

application {
    // Define the main class for the application.
    mainClass.set("me.laont.chatty.MainKt")
}

tasks.jar {
    // Set Main-Class attr in MANIFEST.MF to avoid `no main manifest attribute` error
    manifest {
        attributes["Main-Class"] = "me.laont.chatty.MainKt"
    }
}
