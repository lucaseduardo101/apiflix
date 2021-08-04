plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.10"
}

group ="org.example"
version="1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.5.2")
    implementation("mysql:mysql-connector-java:8.0.26")
    implementation("org.springframework.boot:spring-boot-starter-web:2.5.2")
    implementation("org.hibernate:hibernate-entitymanager:5.5.4.Final")

}
