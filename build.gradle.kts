plugins {
    id("java")
    id("maven-publish")
}

group = "de.dreierschach"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies { // https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
    implementation("org.apache.commons:commons-lang3:3.12.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}



publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

