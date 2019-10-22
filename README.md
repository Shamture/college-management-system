# An Example Backend Project with Spring Boot

The project idea based on a (little) college-management-system.

## Dependency

- MySQL server (running 10.4.7-MariaDB, for Linux (x86_64))
- Maven
- java-jdk-8

## Tools

- Eclipse or Intellij
- DBeaver ([https://dbeaver.io/](https://dbeaver.io/))
- Postman

---

## REST Paths

| Method |        Path        |      Description       |
| ------ | :----------------: | :--------------------: |
| GET    |   /api/students    | get a list of students |
| GET    | /api/students/{id} |  get a student by id   |
| POST   |   /api/students    |    create a student    |
| PUT    |   /api/students    |    update a student    |
| DELTE  | /api/students/{id} | delete a student by id |

### Path in general

/api/entityname/

### Entity names

- students
- courses
- instructors

## Database Overview

### Relationship Model

![Database Relationship Model](db-schema-college-management-system.png)

### Table Schema

![Table Schema](table-schema.png)

## Setup

### Create database

1. Create MySql Server with a db-account
2. Execute in your database tool the script `sql-scripts/create-db.sql`
3. Then execute `sql-scripts/create-tables.sql`

### Launch the project

1. Import the `workspace/college-management-system/pom.xml` as Maven project in your IDE.
2. Run the `CollegeManagementSystemApplication.java` as Java application.
3. Create some request in Postman or curl.
