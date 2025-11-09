# 🧩 Topic 02 – Constructors in Java

## 📖 Overview
A **constructor** is a special method used to **initialize objects**.  
It has the **same name as the class** and **no return type**.

---

## ⚙️ Types of Constructors
1. **Default Constructor** – Automatically provided if no constructor is defined.
2. **Parameterized Constructor** – Used to pass and initialize values.
3. **Copy Constructor** – Manually copies values from another object.

---

## 💻 Code Example
```java
class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called");
    }

    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called");
    }

    Student(Student s) {
        name = s.name;
        age = s.age;
        System.out.println("Copy constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
