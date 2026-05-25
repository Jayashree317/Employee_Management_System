# Employee Management System

A full-stack Employee Management System developed using Java Spring Boot, MySQL, HTML, CSS and Thymeleaf.  
This application helps manage employees and departments with CRUD operations and responsive UI.

---

## Features

- Add Employee
- Update Employee
- Delete Employee
- View Employee List
- Department Management
- Responsive UI using Bootstrap
- MySQL Database Integration

---

## Technologies Used

### Backend
- Java
- Spring Boot
- Spring Data JPA (Hibernate)

### Frontend
- HTML
- CSS
- Thymeleaf

### Database
- MySQL

### Tools
- Eclipse IDE
- Git & GitHub

---

## Project Structure

EmployeeManagementSystem
│
├── src/main/java
├── src/main/resources
│ ├── templates
│ ├── static
│ └── application.properties
│
└── pom.xml

---

## Project Screenshots

### Home Page
![Home Page](https://github.com/Jayashree317/Employee_Management_System/blob/main/Screenshot%202026-05-25%20214228.png)

### Employee Form
![Employee Form](https://github.com/Jayashree317/Employee_Management_System/blob/main/Screenshot%202026-05-25%20214453.png)

### Department Page
![Department Page](https://github.com/Jayashree317/Employee_Management_System/blob/main/Screenshot%202026-05-25%20214618.png)

### Add Department
![Add Employee](https://github.com/Jayashree317/Employee_Management_System/blob/main/Screenshot%202026-05-25%20215006.png)

---

## Database Configuration

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


