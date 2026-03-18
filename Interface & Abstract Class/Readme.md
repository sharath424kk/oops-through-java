# 📂 oops-through-java

This repository contains practical examples of Object-Oriented Programming (OOP) concepts in Java, specifically focusing on **Interfaces** and **Abstract Classes**.

---

## 📖 Core Definitions

### 1. Interface
An **Interface** is a formal **contract**. It defines *what* a class must do, but not *how* it should do it.
*   **Pure Abstraction:** It only contains method signatures (no code bodies).
*   **Multiple Inheritance:** A class can implement many interfaces at once.
*   **Implicit Rules:** All methods are automatically `public` and `abstract`.

### 2. Abstract Class
An **Abstract Class** is a **partial blueprint**. It is a restricted class that cannot be used to create objects (`new` is not allowed).
*   **Mixed Methods:** It can have both abstract methods (no code) and regular methods (with code).
*   **State:** It can have normal variables (fields) to store data like `int health`.
*   **Identity:** Used for an **"is-a"** relationship (e.g., a `Dog` **is a** `Animal`).

### 3. The "Pass-Through" Rule
If an **Abstract Class** implements an interface, it is **not required** to write the method code immediately. It passes that responsibility down to the first **Concrete (Normal) Class** that inherits from it.

---

## 🛠️ Project Structure & Programs


| File Name | Concept | Description |
| :--- | :--- | :--- |
| `BasicInterface.java` | **The Contract** | Basic implementation of an interface. |
| `MultipleInheritance.java` | **Multiple Skills** | Using `extends` and `implements` in one class. |
| `InterfaceInheritance.java` | **Layering** | How an interface can `extend` another interface. |
| `AbstractBridge.java` | **The Bridge** | An abstract class passing interface rules to a child class. |

---

## 🚀 How to Run
1. Open your terminal or command prompt.
2. Compile the file: 
   ```bash
   javac FileName.java
