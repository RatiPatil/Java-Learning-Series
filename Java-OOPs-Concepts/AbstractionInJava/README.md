# 07 — Abstraction in Java

## 📌 Definition
**Abstraction** is the process of hiding internal implementation details and showing only the essential features of an object.  
In simple words, *you see only what you need, and the complex logic is hidden*.

Example in real life:  
- When you drive a car, you only use the steering, brakes, and accelerator.  
- You do NOT see the engine’s internal working.  
This is abstraction.

---

## 📘 Explanation
In Java, abstraction helps you reduce complexity by exposing only necessary behavior to the user while hiding background logic.

Java provides abstraction through:
1. **Abstract Classes**  
2. **Interfaces**

### 🔹 Abstract Classes
- Declared using the `abstract` keyword  
- Can have both:
  - **Abstract methods** (no body)
  - **Concrete methods** (with body)
- Cannot be instantiated  
- Must be extended by a subclass  

### 🔹 Why is Abstraction Important?
- Reduces code complexity  
- Increases security by hiding details  
- Provides a template for subclasses  
- Supports flexible and maintainable code  
- Allows different implementations for the same behavior  

---

## 📂 Files Included

| File Name | Description |
|----------|-------------|
| **AbstractionExample.java** | Java program demonstrating abstraction using abstract classes |
| **output.txt** | Program output |
| **explanation.md** | Detailed explanation of abstraction and example |

---

## ▶ How to Run
```bash
javac AbstractionExample.java
java AbstractionExample
