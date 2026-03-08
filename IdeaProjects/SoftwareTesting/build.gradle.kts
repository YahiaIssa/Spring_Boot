plugins {
    kotlin("jvm") version "2.3.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.arrow-kt:arrow-core:1.2.1")
    implementation("io.insert-koin:koin-core:4.0.2")
    testImplementation("io.kotest:kotest-runner-junit5:5.7.2")
    testImplementation("io.kotest:kotest-assertions-core:5.7.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.0")
    testImplementation("com.google.truth:truth:1.4.2")
    testImplementation("io.mockk:mockk:1.14.9")



}

kotlin {
    jvmToolchain(24)
}

tasks.test {
    useJUnitPlatform()
}
tasks.test {
    useJUnitPlatform()
    // أضف هذا السطر لإخفاء تحذيرات Unsafe
    jvmArgs("--add-opens=java.base/sun.misc=ALL-UNNAMED")
}