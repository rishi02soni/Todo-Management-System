# 🚀 Todo Management System (Spring Boot)

A scalable and production-ready **Todo Management REST API** built using **Spring Boot**, demonstrating clean architecture, RESTful design, and efficient data handling.

---

## 📌 Overview

This project provides a backend system to manage tasks (todos) with features like creation, updates, filtering, and search.

It follows **industry-standard backend architecture**:

* Controller → Service → Repository → Database
* Separation of concerns
* Scalable and maintainable codebase

---

## ⚙️ Tech Stack

* ☕ Java 17
* 🌱 Spring Boot
* 🗄️ Spring Data JPA (Hibernate)
* 🧠 H2 In-Memory Database
* 🔗 REST APIs
* 📑 Maven

---

## 🧱 Architecture

```
Controller → Service → Repository → Database
```

* **Controller** → Handles HTTP requests
* **Service** → Business logic layer
* **Repository** → Database operations
* **Entity** → Data model

---

## 📁 Project Structure

```
todo-app/
 ├── src/main/java/com/example/todo/
 │    ├── controller/
 │    │    └── TodoController.java
 │    ├── service/
 │    │    └── TodoService.java
 │    ├── repository/
 │    │    └── TodoRepository.java
 │    ├── model/
 │    │    └── Todo.java
 │    └── TodoApplication.java
 │
 ├── src/main/resources/
 │    └── application.properties
 │
 └── pom.xml
```

---

## 🚀 Features

✅ Create Todo
✅ Get All Todos
✅ Get Todo by ID
✅ Update Todo
✅ Delete Todo
✅ Search Todos by keyword
✅ Filter by completion status

---

## ▶️ Getting Started

### 🔹 Prerequisites

* Java 17+
* Maven installed

---

### 🔹 Clone Repository

```
git clone https://github.com/your-username/todo-app.git
cd todo-app
```

---

### 🔹 Run Application

```
mvn clean install
mvn spring-boot:run
```

---

## 🔌 API Endpoints

### 📍 Create Todo

```
POST /todos
```

### 📍 Get All Todos

```
GET /todos
```

### 📍 Get Todo by ID

```
GET /todos/{id}
```

### 📍 Update Todo

```
PUT /todos/{id}
```

### 📍 Delete Todo

```
DELETE /todos/{id}
```

### 📍 Search Todos

```
GET /todos/search?keyword=task
```

### 📍 Filter by Status

```
GET /todos/status?completed=true
```

---

## 🧪 Sample Request

```
POST /todos
```

```json
{
  "title": "Learn Spring Boot",
  "description": "Build REST APIs",
  "completed": false
}
```

---

## 🧪 Sample Response

```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Build REST APIs",
  "completed": false
}
```

---

## 🗄️ Database Configuration

```
spring.datasource.url=jdbc:h2:mem:todo-db
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
```

👉 Access H2 Console:

```
http://localhost:8080/h2-console
```

---

## 📊 Performance & Design Highlights

* ⚡ Lightweight and fast API responses
* 🧱 Clean layered architecture for scalability
* 🔄 Efficient CRUD operations using JPA
* 🔍 Optimized search and filtering queries

---

## 🔄 Future Enhancements

* 🔐 JWT Authentication & Authorization
* 🐳 Docker Containerization
* ⚡ Redis Caching
* 📩 Kafka Event-driven architecture
* 🗄️ PostgreSQL / MySQL integration

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a new branch
3. Make changes
4. Submit a Pull Request

---

## 📜 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

**Rishi Soni**

* 💼 Aspiring Backend Engineer (SDE-2)
* 🚀 Passionate about scalable systems, APIs & microservices

---

## 🌟 Show Your Support

If you found this project useful:

⭐ Star the repository
🔗 Share on LinkedIn
📌 Follow for more projects

---

## 💡 Resume Line (ATS Optimized)

> Developed a scalable Todo Management REST API using Spring Boot and JPA, implementing search and filtering features with clean layered architecture for improved maintainability and performance.

---
