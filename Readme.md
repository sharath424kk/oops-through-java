# oops through java
# 🚀 OOPS Through Java: Interface & Abstract Class

This repository contains clear examples of Object-Oriented Programming (OOPS) in Java, specifically focusing on the relationship between **Interfaces** and **Abstract Classes**.

## 📝 Key Concepts Learned

### 1. What is an Interface?
A **Contract** that defines *what* a class should do (method signatures) but not *how* to do it.
- **Multiple Inheritance:** A class can implement many interfaces.
- **Implicitly Public/Abstract:** Methods don't need these keywords; they are added by default.

### 2. Interface vs. Abstract Class

| Feature | Interface | Abstract Class |
| :--- | :--- | :--- |
| **Inheritance** | `implements` (Multiple) | `extends` (Single) |
| **Methods** | Mostly Abstract (no body) | Both Abstract and Concrete |
| **Variables** | Constants only | Any access modifier/type |

### 3. The "Pass-Through" Rule
If an **Abstract Class** implements an interface, it is NOT compulsory to provide method bodies. The first **Concrete Class** to inherit from it must do the work.

---

## 🛠️ Program Guide

### [1. Basic Interface](BasicInterface.java)
Shows how a class signs a contract with an interface.

### [2. Multiple Inheritance](MultipleInheritance.java)
Demonstrates the `class Car extends Vehicle implements GPS` structure.

### [3. Interface Inheritance](InterfaceInheritance.java)
Shows how an interface can `extend` another interface to layer requirements.

### [4. The Abstract Bridge](AbstractBridge.java)
Shows an abstract class "passing the homework" of implementation down to its child.
