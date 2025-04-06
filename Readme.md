# 🔐 Spring Boot JWT Authentication and Authorization

This is a simple **Authentication & Authorization** module built with **Spring Boot**, using **JWT (JSON Web Tokens)** for stateless security.

The project demonstrates:
- ✅ User Registration and Login
- 🔐 JWT-based Authentication
- 🧑‍💼 Role-based Authorization (`USER`, `ADMIN`)
- 🛡️ Secure REST APIs using Spring Security (2024 standards)
- 🧪 In-memory H2 Database
- 📦 Clean and modular architecture

---

## 🏗️ Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Security 6
- Spring Data JPA
- H2 Database (for dev/testing)
- JWT (via `jjwt` library)

---

## 🚀 Endpoints

| Method | Endpoint        | Description               | Access      |
|--------|------------------|---------------------------|-------------|
| POST   | `/auth/register` | Register a new user       | Public      |
| POST   | `/auth/login`    | Authenticate and get JWT  | Public      |
| GET    | `/hello`         | Test Authenticated Access | `USER`, `ADMIN` |
| GET    | `/admin`         | Admin-only Access         | `ADMIN`     |

---

## 🛂 Role-Based Access

This project supports basic **Role-based Authorization** using Spring Security's `@PreAuthorize` annotation.

```java
@PreAuthorize("hasRole('ADMIN')")
@GetMapping("/admin")
public String adminAccess() {
    return "Welcome Admin!";
}
