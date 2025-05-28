# ⚡ graphql-crud-surge

A blazing-fast GraphQL backend for basic CRUD operations built with **Spring Boot**, **Java**, and **H2 in-memory database**. Perfect for learning GraphQL with a clean, code-first architecture and modular structure.

---

## 🚀 Features

- ✅ Code-first GraphQL using `spring-graphql`
- 📦 H2 in-memory database for zero config
- 🔁 Full CRUD operations for `User` entity
- 🧩 Clean architecture (DTO, Service, Repository, Controller)
- 🧪 Ready for integration with frontend clients (React, Angular, etc.)

---

## 🏗️ Tech Stack

| Layer         | Tech                       |
| ------------- | -------------------------- |
| Backend       | Java 17, Spring Boot 3     |
| API           | GraphQL (Spring for GraphQL) |
| DB            | H2 in-memory               |
| Build Tool    | Maven                      |

---

## 📁 Project Structure

```bash
graphql-crud-surge/
├── src/
│   ├── main/
│   │   ├── java/com/xperiense/graphqlcrudsurge/
│   │   │   ├── model/             # Entity class
│   │   │   ├── dto/               # GraphQL input types
│   │   │   ├── repository/        # Spring Data JPA repo
│   │   │   ├── service/           # Business logic
│   │   │   ├── controller/        # GraphQL resolvers (query + mutation)
│   │   │   └── GraphqlCrudSurgeApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── schema.graphqls    # GraphQL schema
│   └── test/
└── pom.xml
````

---

## 🧪 Example GraphQL Queries

### ➕ Create User

```graphql
mutation {
  createUser(input: {
    name: "Alice",
    email: "alice@example.com",
    age: 28
  }) {
    id
    name
  }
}
```

### 📥 Get All Users

```graphql
query {
  getAllUsers {
    id
    name
    email
    age
  }
}
```

### 🔄 Update User

```graphql
mutation {
  updateUser(id: 1, input: {
    name: "Alice Updated",
    email: "alice.updated@example.com",
    age: 29
  }) {
    id
    name
  }
}
```

### ❌ Delete User

```graphql
mutation {
  deleteUser(id: 1)
}
```

---

## ▶️ Run Locally

### Prerequisites

* Java 17+
* Maven

### Steps

```bash
git clone https://github.com/Nuraj250/graphql-crud-surge.git
cd graphql-crud-surge
mvn spring-boot:run
```

GraphQL endpoint will be available at:
📍 `http://localhost:8080/graphql`
🔍 Test queries at: `http://localhost:8080/graphiql`

---

## 🎯 TODO (Ideas for Expansion)

* ✅ Modular query/mutation resolvers
* 🔒 Add validation & error handling
* 📦 Switch to PostgreSQL or MySQL
* 🛠️ Dockerize the app
* 📜 Add pagination and filtering
* 🔐 Add role-based authentication

---

## 🤝 Contributing

Feel free to fork this project, raise issues, and submit PRs. It's a great starting point for learning or building something more powerful.

---

## 📄 License

MIT © [Nuraj250](https://github.com/Nuraj250)

