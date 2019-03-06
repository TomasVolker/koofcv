plugins {
    kotlin("jvm") version "1.3.21"
    maven
}

group = "tomasvolker"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testCompile("junit", "junit", "4.12")

    compile(group = "org.boofcv", name = "boofcv-core", version = "0.32")

}
