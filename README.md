# 💰 Transaction Service - Smart Digital Wallet

## 📌 Overview

This module is part of the **Smart Digital Wallet & Expense Management Application**.
It is responsible for handling all **money-related operations**, including transaction history, credit/debit processing, and balance calculation.

---

## 🚀 Features

* Add Credit / Debit Transactions
* Maintain Transaction History
* Calculate User Wallet Balance
* RESTful API Integration
* Scalable Microservice Design

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* REST APIs

---

## 📂 Project Structure

```
com.wallet
│
├── controller        # API Layer
├── service           # Business Logic
├── repository        # Database Layer
├── entity            # Database Models
├── dto               # Request/Response Objects
└── WalletApplication.java
```

---

## ⚙️ Dependencies

* spring-boot-starter-web
* spring-boot-starter-data-jpa
* mysql-connector
* lombok
* spring-boot-starter-validation

---


## 🗄️ Database Configuration

Update in `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/wallet_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Running the Application

1. Clone the repository
2. Configure MySQL database
3. Run the Spring Boot application
4. Test APIs using Postman

---

## 📌 Role Contribution

Developed **Transaction Service** focusing on:

* Transaction History Management
* Money Flow Handling
* Wallet Balance Calculation



---
