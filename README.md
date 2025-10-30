# 📚 Book Application (Spring Boot)

A simple **Spring Boot CRUD application** that manages books using REST APIs.  
You can **add, get, update, and delete** book records from the database.

---

## 🚀 Tech Stack
- **Spring Boot** (Web, JPA)
- **Hibernate / JPA**
- **H2 / MySQL** (configurable)
- **Lombok** (for boilerplate code reduction)
- **Java 17+**

---

## 🧩 Project Structure
com.example.BookApplication
│
├── Controller
│ └── BookController.java # REST API endpoints
│
├── Entity
│ └── Book.java # JPA entity for Book
│
├── Repository
│ └── BookRepository.java # Database operations
│
└── Service
└── BookService.java # Business logic
