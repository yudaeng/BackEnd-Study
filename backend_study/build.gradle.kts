plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // https://mvnrepository.com/artifact/com.google.code.gson/gson
    implementation ("com.google.code.gson:gson:2.10.1")
// https://mvnrepository.com/artifact/org.jsoup/jsoup
    implementation ("org.jsoup:jsoup:1.15.3")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

}

tasks.test {
    useJUnitPlatform()
}