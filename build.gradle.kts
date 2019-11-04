plugins {
    kotlin("jvm").version("1.3.50")
}

repositories {
    mavenCentral()
    jcenter()
}

group = "com.github.gabriel-shanahan"
version = "1.2.3"


dependencies {
    implementation(kotlin("stdlib"))
    compile(kotlin("reflect"))
    testCompile("io.kotlintest:kotlintest:2.0.7")
}