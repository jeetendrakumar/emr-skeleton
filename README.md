# emr-skeleton

## Introduction

EMR skeleton is a sample Spring Boot project which exposes few REST end points. The project makes use of embedded H2 database. Spring Data JPA module is used for DB interactions.
 
## General Environment Description

The module makes use of gradle for project build & dependency management. Gradle wrapper is distributed along with the project which helps to build & run gradle commands without actually installing gradle.
JaCoCo plugin is configured to get the code coverage metrics for Java code.

### Gradle Command-Line

    gradlew clean build
 The above command will execute compile, test and build tasks.
 
### Starting the application

Execute the following commant from the root of the project after the project is built.
java -jar build/libs/emr-skeleton-0.1.0.jar


### Sample REST End points

#### SAVE (HTTP METHOD POST)
http://localhost:8080/emr/api/v1_0/person 

{
  "name": "Jeetendra Kumar",
  "address": "Bangalore",
  "ssn": "799987987"
}

#### UPDATE (HTTP METHOD PUT)

{
  "id" : 1,
  "name": "Jeetendra Kumar updated",
  "address": "Bangalore",
  "ssn": "799987987"
}

#### GET (HTTP METHOD GET)
http://localhost:8080/emr/api/v1_0/person/1


#### GET ALL (HTTP METHOD GET)
http://localhost:8080/emr/api/v1_0/persons

#### DELETE (HTTP METHOD DELETE)
http://localhost:8080/emr/api/v1_0/person/1



