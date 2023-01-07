plugins {
    java
    id("org.springframework.boot") version "3.0.0"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.springboot.blog"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_19

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {

    //jpa hibernate
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")

    //spring security
    implementation("org.springframework.boot:spring-boot-starter-security")

    //lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")

    //database
    runtimeOnly("org.postgresql:postgresql")

    //testing
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    //model mapper
    implementation("org.modelmapper:modelmapper:2.4.5")

    //validation
    implementation("org.springframework.boot:spring-boot-starter-validation")

//    //jwt
//    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.11.5")
//    implementation("io.jsonwebtoken:jjwt-api:0.11.5")
//    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.11.5")


}

tasks.withType<Test> {
    useJUnitPlatform()
}
