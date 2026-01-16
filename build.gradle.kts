plugins {
    id("java")
}

group = "io.github.mariusraupach"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    compileOnly(files("libs/HytaleServer.jar"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

    from("src/main/resources")

    finalizedBy("copyJar")
}

tasks.register<Copy>("copyJar") {
    from(tasks.jar)

    into(File(System.getProperty("user.home"), "Library/Application Support/Hytale/UserData/Mods"))
}
