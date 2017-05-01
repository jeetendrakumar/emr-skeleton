# emr-skeleton

## Introduction

EMR skeleton is a sample Spring Boot project which exposes few REST end points. The project makes use of embedded H2 database. Spring Data JPA module is used for DB interactions.
 
## General Environment Description

The module makes use of gradle for project build & dependency management. Gradle wrapper is distributed along with the project which helps to build & run gradle commands without actually installing gradle.
JaCoCo plugin is configured to get the code coverage metrics for Java code.

### Gradle Command-Line

    gradlew clean build
 The above command will execute compile, test and build tasks.
