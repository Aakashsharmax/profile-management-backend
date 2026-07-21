🚀 Profile Management System - Backend
![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5-6DB33F?style=for-the-badge&logo=springboot)
![MongoDB](https://img.shields.io/badge/MongoDB-5.0-47A248?style=for-the-badge&logo=mongodb)
![JWT](https://img.shields.io/badge/JWT-Authentication-black?style=for-the-badge&logo=jsonwebtokens)
![Cloudinary](https://img.shields.io/badge/Cloudinary-Image_Upload-3448C5?style=for-the-badge&logo=cloudinary)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-85EA2D?style=for-the-badge&logo=swagger)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven)


Spring Boot REST API for a Full Stack Profile Management System with JWT Authentication, MongoDB, Cloudinary Image Upload, Swagger Documentation, and Secure CRUD Operations.

⸻

📌 Overview

This project is the backend service of the Profile Management System.

It provides secure REST APIs for managing user profiles with authentication using JWT.

The application is built following modern Spring Boot development practices and can be integrated with any frontend application.

⸻

✨ Features
 
- Secure User Registration & Login
- JWT Authentication & Authorization
- BCrypt Password Encryption
- CRUD Operations for Profiles
- Image Upload using Cloudinary
- MongoDB Database Integration
- Global Exception Handling
- RESTful API Design
- Swagger/OpenAPI Documentation
- Layered Architecture (Controller → Service → Repository)
- CORS Configuration
- Spring Security Integration
⸻

🛠 Tech Stack

* Java 21+
* Spring Boot
* Spring Security
* JWT
* MongoDB
* Cloudinary
* Swagger (OpenAPI)
* Maven

⸻

## 🏗️ Architecture

```text
React Frontend
        │
        ▼
Spring Boot REST API
        │
 ┌──────┼─────────┐
 │      │         │
 ▼      ▼         ▼
 JWT  Cloudinary MongoDB
```


📂 Project Structure

src
├── config
├── controller
├── dto
├── exception
├── model
├── repository
├── service
├── util
└── resources

⸻

🔐 Authentication

The application uses JWT Authentication.

Flow:

User Login

↓

JWT Token Generated

↓

Frontend Stores Token

↓

Every API Request sends

Authorization: Bearer 

↓

Protected APIs are Accessible

⸻

📚 REST APIs

Authentication

POST /auth/register

POST /auth/login

⸻

Profiles

GET /profiles

POST /profiles

PUT /profiles/{id}

DELETE /profiles/{id}

⸻

📖 Swagger

After running the application:

http://localhost:8081/swagger-ui/index.html

⸻

⚙️ Installation

Clone the repository

git clone https://github.com/Aakashsharmax/profile-management-backend.git

Go inside project

cd profile-management-backend

Run application

mvn spring-boot:run

⸻

📸 Screenshots

Coming Soon

⸻

🔮 Future Improvements

* Role Based Authentication
* Email Verification
* Password Reset
* Docker Support
* Unit Testing
* CI/CD Pipeline

⸻

👨‍💻 Author

Aakash Sharma

B.Tech CSE (AI/ML)

Java Backend Developer

GitHub:

https://github.com/Aakashsharmax
