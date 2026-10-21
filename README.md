# Employee Management REST API (Java + Spring Boot)

A small practice project demonstrating a REST API that retrieves and accepts employee records.

**Attribution:** This is an independently assembled practice implementation for learning and portfolio practice. It is not an official HPE codebase or code supplied by HPE/Forage. Describe the HPE activity as a virtual job simulation hosted on Forage.

## Features
- `GET /employees` — returns employee records.
- `POST /employees` — accepts employee JSON and returns `201 Created`.
- Validates required fields and positive salary.
- Duplicate employee IDs return `409 Conflict`.
- Invalid JSON or invalid fields return `400 Bad Request`.
- JUnit + Spring MockMvc tests for GET, POST, and validation.

## Requirements
- JDK 17 or later
- Maven 3.6+ (the project does not include a Maven Wrapper)
- VS Code with the Extension Pack for Java

## Run in VS Code
1. Extract the ZIP.
2. In VS Code, choose **File → Open Folder** and select `hpe-employee-management-api`.
3. Open **Terminal → New Terminal**.
4. Run `java -version` to verify Java is installed.
5. Run `mvn spring-boot:run`.
6. Open `http://localhost:8080/employees` in a browser.

If `mvn` is not recognized, install Maven or configure Maven in your IDE.

## API examples

### GET all employees
`GET http://localhost:8080/employees`

### POST an employee
In Postman, choose POST and use `http://localhost:8080/employees`. Set `Content-Type: application/json`, select raw JSON body, and send:

```json
{
  "employeeId": "EMP103",
  "name": "Meera Iyer",
  "department": "Engineering",
  "salary": 50000
}
```

Expected status: `201 Created`.

## Run tests
`mvn test`

## Limitations
- Employee records are stored in memory, not a database. Records added by POST are lost when the application restarts.
- This is a learning/demo project and is not production-ready. It does not implement authentication, authorization, database persistence, or production deployment.
- Run tests locally and verify results before claiming they passed.
