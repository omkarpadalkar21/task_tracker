# Task Tracker (Practice Project)

A robust task management application built with Spring Boot that allows users to organize and track tasks efficiently.

## Features

- Task Management (Create, Read, Update, Delete)
- Task List Organization
- Task Priority Levels
- Task Status Tracking (Open/Closed)
- RESTful API endpoints
- PostgreSQL Database Integration
- Exception Handling

## Tech Stack

- Java 17
- Spring Boot 3.3.5
- Spring Data JPA
- PostgreSQL (Production Database)
- H2 Database (Testing)
- Maven

## Project Structure

```
src/
├── main/
│   └── java/
│       └── com/
│           └── omkar/
│               └── task_tracker/
│                   ├── controllers/      # REST Controllers
│                   ├── domain/           # Entities and DTOs
│                   ├── mappers/          # Object Mappers
│                   ├── repositories/     # Data Access Layer
│                   └── services/         # Business Logic Layer
```

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- PostgreSQL

### Installation

1. Clone the repository
2. Configure database settings in `application.properties`
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

### Tasks
- `GET /api/tasks` - Get all tasks
- `GET /api/tasks/{id}` - Get a specific task
- `POST /api/tasks` - Create a new task
- `PUT /api/tasks/{id}` - Update a task
- `DELETE /api/tasks/{id}` - Delete a task

### Task Lists
- `GET /api/tasklists` - Get all task lists
- `GET /api/tasklists/{id}` - Get a specific task list
- `POST /api/tasklists` - Create a new task list
- `PUT /api/tasklists/{id}` - Update a task list
- `DELETE /api/tasklists/{id}` - Delete a task list

## Error Handling

The application includes global exception handling with appropriate HTTP status codes and error messages.

## Testing

The project includes unit tests and integration tests. Run tests using:
```bash
mvn test
```

## License

This project is open source and available under the [License](LICENSE).
