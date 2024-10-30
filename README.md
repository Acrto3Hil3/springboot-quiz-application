# Spring Boot Quiz Application

This application is a quiz management system developed with Spring Boot, designed to create, update, delete, and display quiz questions through RESTful APIs. This application serves as a backend for managing quiz data, supporting CRUD operations while maintaining a clean and efficient architecture.

## Table of Contents

- [Project Overview](#project-overview)
- [Tech Stack](#tech-stack)
- [Architecture and Workflow](#architecture-and-workflow)
- [Setup and Installation](#setup-and-installation)
- [API Endpoints](#api-endpoints)
- [Future Enhancements](#future-enhancements)

---

## Project Overview

The Spring Boot Quiz Application enables users to manage quizzes, handle question data, and perform various CRUD operations. The application leverages Spring Boot’s MVC architecture and data persistence with JPA to ensure scalability and maintainability.

## Tech Stack

- **Java**: Core programming language.
- **Spring Boot**: Framework for building the application with embedded server support.
- **Spring Data JPA**: For ORM and database interactions.
- **MySQL**: Relational database for storing quiz data.
- **Lombok**: Reduces boilerplate code (e.g., getters, setters).
- **Maven**: Dependency and build management.

## Architecture and Workflow

The application follows a structured MVC-based architecture with layered components for modularity and clarity. Here’s an overview of the key components and how they interact:

### Architecture Layers

1. **Controller**: Manages incoming HTTP requests and routes them to the service layer.
2. **Service**: Handles business logic and orchestrates data flow between the controller and repository layers.
3. **Repository**: Uses Spring Data JPA for CRUD operations, mapping Java objects to database tables.
4. **Database**: Stores quiz questions and other relevant data.

### Workflow Diagram

Here's the workflow diagram to visualize the request and response flow within the application:

```plaintext
            +----------------+        +----------------+        +----------------+        +----------------+
            |                |        |                |        |                |        |                |
            |   User/Client  | -----> |   Controller   | -----> |    Service     | -----> |   Repository   |
            |                |        |                |        |                |        |                |
            +----------------+        +----------------+        +----------------+        +----------------+
                    |                           |                       |                         |
                    |                           |                       |                         |
                    |                           V                       V                         |
                    |                     Validation              Business Logic                 |
                    |                                                                            |
                    |                                                                            |
                    | <----------------------------------- Response -----------------------------|
                    V
                 Database
```

In this setup:
- The **Controller** layer routes requests and validates input.
- The **Service** layer processes business logic and calls the repository as needed.
- The **Repository** interacts with the **Database** to perform CRUD operations.

## Setup and Installation

### Prerequisites
- **Java 21** or higher
- **Maven** (for building the project)
- **MySQL** (for the database)

### Installation

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   ```

2. **Navigate to the project directory**:
   ```bash
   cd springboot-quiz-app
   ```

3. **Configure the database**:
   Update `src/main/resources/application.properties` with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost/springpractise
   spring.datasource.username=<your-username>
   spring.datasource.password=<your-password>
   spring.jpa.hibernate.ddl-auto=update
   ```

4. **Build and run the application**:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### Database Setup
On the first run, JPA will automatically generate the required database schema based on the entity classes.

## API Endpoints

| Method | Endpoint             | Description                |
|--------|-----------------------|----------------------------|
| GET    | `/api/quizzes`       | Retrieve all quiz data     |
| POST   | `/api/quizzes`       | Add a new quiz question    |
| PUT    | `/api/quizzes/{id}`  | Update a quiz question     |
| DELETE | `/api/quizzes/{id}`  | Delete a quiz question     |

## Future Enhancements

- **User Authentication**: Add user roles such as admin and regular user.
- **Score Tracking**: Track quiz scores and responses for each user.
- **Enhanced Reporting**: Provide data analytics on quiz performance.
