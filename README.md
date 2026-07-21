🚀 Profile Management System - Backend

Spring Boot REST API for a Full Stack Profile Management System with JWT Authentication, MongoDB, Cloudinary Image Upload, Swagger Documentation, and Secure CRUD Operations.

⸻

📌 Overview

This project is the backend service of the Profile Management System.

It provides secure REST APIs for managing user profiles with authentication using JWT.

The application is built following modern Spring Boot development practices and can be integrated with any frontend application.

⸻

✨ Features

* JWT Authentication & Authorization
* User Registration & Login
* Secure REST APIs
* Profile CRUD Operations
* MongoDB Database Integration
* Cloudinary Image Upload
* Swagger API Documentation
* Global Exception Handling
* CORS Configuration
* Password Encryption using BCrypt
* Layered Architecture
* Spring Security

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
