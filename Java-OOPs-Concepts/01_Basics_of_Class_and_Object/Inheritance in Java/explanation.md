# Inheritance in Java

## 🔹 Definition
Inheritance is one of the core concepts of Object-Oriented Programming (OOP).  
It allows one class (child/subclass) to **inherit properties and behaviors** from another class (parent/superclass).

This helps achieve **code reusability** and **method overriding**.

---

## 🔹 Example Explained
In the program:
- `Animal` → Parent class  
- `Dog` → Child class of `Animal`  
- `Puppy` → Child class of `Dog` (multi-level inheritance)

`Puppy` can access all the methods of `Dog` and `Animal`.

---

## 🔹 Types of Inheritance in Java
1. **Single Inheritance** → One class inherits another.  
   → Example: `Dog` extends `Animal`
2. **Multilevel Inheritance** → Class derived from another derived class.  
   → Example: `Puppy` extends `Dog` extends `Animal`
3. **Hierarchical Inheritance** → Multiple classes inherit one parent class.  
   → Example: `Dog` and `Cat` inherit `Animal`

> Note: **Multiple inheritance** (a class inheriting from multiple parents) is **not supported** in Java using classes, but can be achieved through **interfaces**.

---

## 🔹 Advantages
- Code reusability  
- Reduces redundancy  
- Easier maintenance and readability  

---

## 🔹 Real-life Example
Think of inheritance like a **family tree**:
- The parent `Animal` class provides general features like `eat()` and `sleep()`.
- The child `Dog` class adds specific behavior like `bark()`.
- The `Puppy` class inherits everything and adds `play()`.

---

## 🔹 Syntax
```java
class Parent {
    // properties and methods
}

class Child extends Parent {
    // child-specific methods
}
