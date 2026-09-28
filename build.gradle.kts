plugins {
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.11.4"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

javafx {
    version = "21.0.5"
    modules = listOf("javafx.controls")
}

application {
    mainClass.set("it.unicam.cs.mpgc.rpg130131.view.Launcher")
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    // Release 21 per massima portabilita: compila anche con JDK piu recenti.
    options.release.set(21)
}

tasks.test {
    useJUnitPlatform()
}