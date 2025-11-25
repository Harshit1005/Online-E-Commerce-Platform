# Online-E-Commerce-Platform
A console-based and GUI-extended E-Commerce management system built using Java, OOP, File Handling/JDBC, DAO architecture, Multithreading, and MySQL Database.
# Features Implemented
## 👤 User Management

Register/Login users

Role-based access: ADMIN / SELLER / BUYER

Role-specific dashboards

## 📦 Product Management

Add new products

Update product details

Delete products

View all/individual products

## 🛍️ Order Management

Buyers can place orders

Auto-calculate order total

Store order summary and items

Update inventory automatically

## 🔐 Database Integration (JDBC)

MySQL database

Secure connection via DBConnection class

Prepared statements for preventing SQL injection

## 🔄 Multithreading & Synchronization

Background threads for:

Order processing

Inventory update

Email/notification simulation

synchronized blocks to avoid inconsistent writes


# Proper File Structure
src/
 └── com.ecommerce
       ├── model
       ├── dao
       ├── impl
       ├── service
       ├── ui
       └── jdbc
# OOP Concepts Implemented

The project follows strong Object-Oriented Programming principles:

## Encapsulation

All model classes (User, Product, Order, OrderItem) use private fields with public getters/setters.

Data is accessed safely through methods only.

## Inheritance

Different user types (Admin, Seller, Buyer) can extend a base User class (if implemented).

Exception and thread classes follow Java inheritance hierarchy.

 ## Polymorphism

DAO interface methods (add(), update(), delete(), getAll()) are overridden in their respective implementation classes like ProductDAOImpl.

 ## Abstraction

DAO interfaces (ProductDAO, UserDAO, OrderDAO) hide database logic from UI.

Service classes provide high-level operations without exposing internal logic.

##  Modular Architecture

Clear separation of:

model

dao

impl

service

ui

jdbc

# Collections & Generics

The project uses Java Collections framework and generics extensively:

## List<Product>, List<Order>

All fetch operations return generic lists:
List<Product> products = productDAO.getAll();
## Type Safety

No raw collections are used.
Generics prevent runtime type errors.

## Iteration

Enhanced for-loop and iterators used in:

Displaying product lists

Printing orders

Managing in-memory data before saving to DB

## Flexible Data Handling

Collections allow:

Sorting products

Filtering by seller

Storing order items temporarily before checkout
# Multithreading & Synchronization

The project implements background tasks using Java Threads.

## Order Processing Thread

A separate thread handles heavy operations like processing orders:
Thread orderThread = new Thread(() -> {
    synchronized (this) {
        processOrder();
        updateInventory();
    }
});
orderThread.start();
## Synchronization

synchronized blocks ensure:

No two users update the same product quantity at the same time

Safe modification of shared resources like inventory

 ## Use Cases

Simulating email/notification sending in background

Preventing double-ordering

Handling concurrent access on shared data

This improves system reliability and prevents race conditions.
