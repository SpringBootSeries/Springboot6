# 🏢 Spring Boot JPA Employee Management System

A comprehensive backend API built with **Spring Boot** and **JPA** to manage `Employees`, `Departments`, `Projects`, and `Insurance` details in an organization.

---

## 📁 Project Structure

```
src/
└── main/
    └── java/
        └── com/backend/Backend/
            ├── model/
            │   ├── Department.java
            │   ├── Employee.java
            │   ├── Insurance.java
            │   └── Project.java
            └── resources/
                └── application.properties
```

---

## ⚙️ Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- Hibernate
- H2 / MySQL Database
- Maven

---

## 🧬 Entity Relationships

- 🧑‍💼 **Employee**
  - 🔁 Many-to-One → **Department**
  - 🔁 Many-to-Many ↔️ **Project**
  - 🔁 One-to-One → **Insurance**

- 🏢 **Department**
  - 🔁 One-to-Many ← **Employees**

- 🧾 **Project**
  - 🔁 Many-to-Many ↔️ **Employees**

- 🛡 **Insurance**
  - 🔁 One-to-One ← **Employee**

---

## 🧪 Sample API Endpoints 

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/employees` | Get all employees |
| POST   | `/employees` | Create new employee |
| GET    | `/departments` | Get all departments |
| POST   | `/projects` | Assign project to employees |
| GET    | `/insurance/{empId}` | Get employee insurance info |

*(Depends on controller implementation)*

---

## ▶️ Run the Application

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

Open in browser: **http://localhost:8080**

---

## 🛠 Features

- Fully annotated JPA Entity models
- Relationships: One-to-Many, Many-to-Many, One-to-One
- Auto schema generation (`ddl-auto=update`)
- Configurable DB via `application.properties`

---

## 🧑‍💻 Author

Made with ❤️ by **Dinuki Prarthana**  
🔗 GitHub: [@Dinuki](https://github.com/Dinuki85)

---

## 📝 License

Licensed under the [MIT License](https://opensource.org/licenses/MIT).  
© 2025 Dinuki Prarthana

---
