# Fast-Food-Management-System-NeatBean-in-Java
# 🍔 Fast Food Management System

A beginner-level **Fast Food Management System** developed using **Java and NetBeans IDE**, with **Microsoft SQL Server** as the database.

The system provides a simple desktop-based solution for managing customers, food items, orders, inventory, payments, and sales reports.

---

## 📌 Project Overview

The **Fast Food Management System** is a Java desktop application designed for basic fast-food restaurant management.

The application provides a simple graphical interface for managing:

- 🏠 Dashboard
- 🍔 Food/Menu
- 🛒 Orders
- 📦 Inventory
- 📊 Reports & Sales
- 💳 Payments
- 🚪 Exit

This is a **beginner-level project** developed for learning Java GUI development, database connectivity, CRUD operations, and basic restaurant management.

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| **Java** | Application development |
| **NetBeans IDE** | Java development environment |
| **Java Swing** | Desktop GUI |
| **Microsoft SQL Server** | Database management |
| **JDBC** | Java-to-SQL Server connectivity |
| **SQL** | Database queries and operations |

---

## 🔐 Login Credentials

The application currently uses a **static login**.

```text
Username: sabestean
Password: admin12345
```

> **Note:** The login credentials are static and are not dynamically retrieved from the database.

For a production-level application, authentication should be connected to the database and passwords should be securely hashed.

---

# ✨ Features

## 🔑 Login System

The application starts with a login screen.

The login page provides:

- Username field
- Password field
- Show Password option
- Login button
- Static authentication

---

## 🏠 Dashboard

After successful login, the user is taken to the main dashboard.

The dashboard provides access to:

- Home
- Menu
- Order
- Inventory
- Reports
- Exit

---

## 🍔 Menu Management

The system provides basic food/menu management.

Food information includes:

- Food ID
- Food Name
- Price
- Quantity

Basic operations include:

- Add
- Search
- Update
- Delete
- Clear

---

## 🛒 Order Management

The Order System allows customers and their orders to be managed.

### Customer Information

- Customer ID
- Customer Name
- Contact Number
- Email

### Order Information

- Food ID
- Food Name
- Price
- Quantity

The system also provides a cart where selected food items can be added before completing an order.

---

## 💳 Payment System

The order module includes basic payment functionality.

It provides:

- Total Amount
- Payment Amount
- Cash Back Amount
- Pay button
- Print option

The system can calculate the total order amount and the cash back amount.

---

## 📦 Inventory

The Inventory section is used to manage food/product-related information.

It provides basic functionality for viewing and managing inventory records.

---

## 📊 Reports & Sales

The **Report & Sales** section provides basic sales information.

It includes:

- Customer ID
- Product/Food Name
- Price
- Quantity
- Total Sales Amount
- Sales details
- Print functionality

---

# 🗄️ Database

This project uses **Microsoft SQL Server** as its database.

The project includes a SQL database script:

```text
database.sql
```

The `database.sql` file contains the SQL commands required to create and/or populate the database used by the application.

---

# ⚙️ Database Setup

### Step 1 — Install Microsoft SQL Server

Install and configure:

- Microsoft SQL Server
- SQL Server Management Studio (SSMS)

---

### Step 2 — Open SQL Server Management Studio

Open **SQL Server Management Studio (SSMS)** and connect to your SQL Server instance.

---

### Step 3 — Run `database.sql`

Open:

```text
database.sql
```

in SQL Server Management Studio.

Execute the script to create the required database and tables.

The database structure should be created according to the SQL script included with this project.

---

### Step 4 — Configure the Java Database Connection

The Java application uses **JDBC** to connect to Microsoft SQL Server.

Check the database connection class in the project and make sure the following settings match your SQL Server installation:

```text
Server Name
Database Name
SQL Server Port
Username
Password
```

A typical SQL Server JDBC connection looks similar to:

```java
String url = "jdbc:sqlserver://localhost:1433;databaseName=YourDatabase;encrypt=false";

Connection con = DriverManager.getConnection(
    url,
    "your_username",
    "your_password"
);
```

> **Important:** Replace the server, database, username, and password with the values configured on your computer.

---

# 🚀 How to Run the Project

### 1. Install Java

Install a compatible **Java JDK**.

### 2. Install NetBeans

Install **NetBeans IDE**.

### 3. Install SQL Server

Install **Microsoft SQL Server** and **SQL Server Management Studio (SSMS)**.

### 4. Create the Database

Open `database.sql` in SSMS and execute the script.

### 5. Configure JDBC

Update the Java database connection settings to match your SQL Server configuration.

### 6. Open the Project

Open the project in NetBeans:

```text
File → Open Project
```

Select the Fast Food Management System project.

### 7. Run the Application

In NetBeans, use:

```text
Run → Run Project
```

or press:

```text
F6
```

---

# 👤 Default Login

Use the following credentials to access the application:

```text
Username: sabestean
Password: admin12345
```

---

# 📂 Project Structure

A typical NetBeans project structure may look like:

```text
Fast-Food-Management-System/
│
├── database.sql
│
├── src/
│   └── ...
│
├── nbproject/
│   └── ...
│
├── build.xml
│
└── README.md
```

The exact structure may vary depending on the NetBeans project configuration.

---

# 🎯 Project Level

**Difficulty:** Beginner

This project is suitable for students and beginners who are learning:

- Java
- Java Swing
- NetBeans
- Microsoft SQL Server
- JDBC
- SQL
- CRUD operations
- Database connectivity
- Desktop application development

---

# ⚠️ Current Limitations

This is a beginner-level application, so it has some limitations:

- Login credentials are static.
- Authentication is not database-driven.
- Passwords are not securely hashed.
- SQL Server connection settings may need to be changed on another computer.
- The application is primarily designed for local desktop use.
- Advanced user roles and permissions are not implemented.
- Inventory and reporting functionality is basic.

---

# 🔮 Possible Future Improvements

The system could be improved by adding:

- Database-based user authentication
- Admin and staff accounts
- Secure password hashing
- Advanced inventory management
- Automatic inventory updates after orders
- Advanced sales reports
- Sales charts and analytics
- Professional invoice generation
- Receipt printing
- Advanced search and filtering
- Database backup and restore
- Multiple user roles
- Online/web-based version

---

# 📚 Learning Objectives

The project demonstrates the basic architecture of a Java desktop application connected to Microsoft SQL Server:

```text
Java
  ↓
Java Swing GUI
  ↓
JDBC
  ↓
Microsoft SQL Server
  ↓
SQL Queries
  ↓
CRUD Operations
  ↓
Orders / Inventory / Sales
```

---

# 👨‍💻 Author

**Sabestean**

**Fast Food Management System**

Developed using:

```text
Java
NetBeans IDE
Java Swing
JDBC
Microsoft SQL Server
```

---

# 📄 License

This project is intended for **educational and learning purposes**.

You may modify and use the project for educational purposes.
