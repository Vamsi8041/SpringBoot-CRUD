Here’s a clean and simple **README.md** file for your Spring Boot Book Application 👇

---

```markdown
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

```

com.example.BookApplication
│
├── Controller
│   └── BookController.java     # REST API endpoints
│
├── Entity
│   └── Book.java               # JPA entity for Book
│
├── Repository
│   └── BookRepository.java     # Database operations
│
└── Service
└── BookService.java        # Business logic

````

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository
```bash
git clone https://github.com/your-username/BookApplication.git
cd BookApplication
````

### 2️⃣ Configure Database (optional)

By default, you can use **H2 in-memory** database for testing.
If you want to connect to **MySQL**, add this in your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

---

## ▶️ Run the Application

Use Maven or your IDE (like IntelliJ / Eclipse):

```bash
mvn spring-boot:run
```

App will start on:
👉 `http://localhost:8080`

---

## 🧠 API Endpoints

### ➕ Add a Book

**POST** `/book/v1/addBook`
**Request Body:**

```json
{
  "name": "Atomic Habits",
  "author": "James Clear",
  "genre": "Self-help"
}
```

---

### 🔍 Get a Book by Name

**GET** `/book/v1/getBook/{bookname}`
**Example:**
`/book/v1/getBook/Atomic Habits`

---

### ✏️ Update a Book

**PUT** `/book/v1/updateBook`
**Request Body:**

```json
{
  "id": 1,
  "name": "Atomic Habits (Updated)",
  "author": "James Clear",
  "genre": "Productivity"
}
```

---

### ❌ Delete a Book

**DELETE** `/book/v1/deleteBook/{id}`
**Example:**
`/book/v1/deleteBook/1`

---

## 🧪 Example Using Postman / curl

### Add Book

```bash
curl -X POST http://localhost:8080/book/v1/addBook \
-H "Content-Type: application/json" \
-d '{"name":"Rich Dad Poor Dad","author":"Robert Kiyosaki","genre":"Finance"}'
```

### Get Book

```bash
curl http://localhost:8080/book/v1/getBook/Rich%20Dad%20Poor%20Dad
```

---

## 📁 Sample Database (H2 Console)

You can access the H2 database console at:

```
http://localhost:8080/h2-console
```

**JDBC URL:** `jdbc:h2:mem:testdb`


Would you like me to make this README more **professional (for GitHub upload)** with badges and proper formatting (e.g., license, contributions, screenshots)?
```
