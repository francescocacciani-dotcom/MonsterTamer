// Configurazione condivisa da tutti i moduli (core, persistence, ui).
subprojects {
    apply(plugin = "java-library")

    repositories {
        mavenCentral()
    }

    tasks.withType<JavaCompile>().configureEach {
        options.encoding = "UTF-8"
        // Release 21 per massima portabilita: compila anche con JDK piu recenti.
        options.release.set(21)
    }

    dependencies {
        "testImplementation"(platform("org.junit:junit-bom:5.11.4"))
        "testImplementation"("org.junit.jupiter:junit-jupiter")
        "testRuntimeOnly"("org.junit.platform:junit-platform-launcher")
    }

    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
    }
}
