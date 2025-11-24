# 10 – Inner Classes in Java

This file contains the **code, explanation, and output** for the topic **Inner Classes** (all in one place as you requested).

---

## ✅ Java Program

```java
// Program to demonstrate different types of Inner Classes in Java

class OuterClass {

    private String message = "Hello from Outer Class!";

    // 1. Regular Inner Class
    class InnerClass {
        void showMessage() {
            System.out.println("Inner Class: " + message);
        }
    }

    // 2. Static Inner Class
    static class StaticInnerClass {
        void display() {
            System.out.println("Static Inner Class method executed");
        }
    }

    // 3. Method Local Inner Class
    void methodWithLocalClass() {
        class LocalInnerClass {
            void localMsg() {
                System.out.println("Local Inner Class inside a method");
            }
        }

        LocalInnerClass obj = new LocalInnerClass();
        obj.localMsg();
    }

    // 4. Anonymous Inner Class
    void anonymousInnerClass() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner Class implementing Runnable");
            }
        };
        run.run();
    }
}

public class InnerClassExample {
    public static void main(String[] args) {

        // Regular Inner Class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass innerObj = outer.new InnerClass();
        innerObj.showMessage();

        // Static Inner Class
        OuterClass.StaticInnerClass staticObj = new OuterClass.StaticInnerClass();
        staticObj.display();

        // Local Inner Class Example
        outer.methodWithLocalClass();

        // Anonymous Inner Class Example
        outer.anonymousInnerClass();
    }
}
```

---

## ✅ Output

```
Inner Class: Hello from Outer Class!
Static Inner Class method executed
Local Inner Class inside a method
Anonymous Inner Class implementing Runnable
```

---

## ✅ Explanation

Inner classes are classes declared inside another class.  
They help to keep code organized and improve encapsulation.

Java has **four types of inner classes**:

---

### **1️⃣ Regular (Non-static) Inner Class**
- Defined inside another class.
- Can access ALL members of the outer class (even private ones).
- Needs an outer class object to be created.

---

### **2️⃣ Static Inner Class**
- Declared with `static`.
- Does NOT need an object of the outer class.
- Can only access static outer members.

---

### **3️⃣ Method Local Inner Class**
- Defined inside a method.
- Can only be used inside that method.
- Helpful for temporary logic.

---

### **4️⃣ Anonymous Inner Class**
- Class without a name.
- Used when you need to override methods quickly.
- Mostly used in GUI, event-handling, Runnable, Threads, etc.

---

## ✅ Summary

| Type | Description |
|------|-------------|
| Regular Inner Class | Uses outer object, full access |
| Static Inner Class | Independent from outer object |
| Local Inner Class | Lives inside a method |
| Anonymous Inner Class | No name, used for quick implementation |

---

## 🚀 How to Run

```
javac InnerClassExample.java
java InnerClassExample
```

---

## ✔ This single file contains:
- Code  
- Output  
- Explanation  

You can directly upload this **README.md** into the folder **10_Inner_Classes**.

