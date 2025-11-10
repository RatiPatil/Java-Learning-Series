# ☕ Java OOPs Concepts — Notes (Day 1 to Day 3)

---

## 🏷️ **01 — Class and Object**

### 📘 **Definition**
- A **class** is a blueprint or template that defines how objects are created.  
- An **object** is a real-world entity created from a class.  
- A class contains **data members (variables)** and **member functions (methods)**.  
- Objects represent specific instances of a class, holding unique values for their data members.

### 💡 **Example in Real Life**
- **Class:** Car  
- **Objects:** BMW, Tesla, Honda  
Each car has properties like color, model, and speed, and behaviors like start() or stop().

### 🧠 **Key Points**
- A class defines structure and behavior once; objects use it many times.  
- Each object has its **own copy** of non-static variables.  
- Objects interact through methods.  
- You can create multiple objects from one class.  

### 🔹 **Advantages**
- Promotes reusability of code.  
- Makes complex programs easy to manage.  
- Provides modular and organized programming structure.

---

## 🏷️ **02 — Constructor**

### 📘 **Definition**
A **constructor** is a special method that initializes objects when they are created.  
It ensures each object starts with valid and defined data.

### 🧩 **Characteristics**
- The name of the constructor **is same as the class name**.  
- It has **no return type** (not even `void`).  
- It is called **automatically** when an object is created using `new`.  

### 🧠 **Purpose of Constructor**
- To **initialize** object variables.  
- To allocate memory and prepare the object for use.

### 🔹 **Types of Constructors**
1. **Default Constructor**  
   - Created automatically if no constructor is defined.  
   - Initializes values with defaults (e.g., `0`, `null`).  

2. **Parameterized Constructor**  
   - Accepts parameters to initialize specific values.  
   - Useful when each object needs unique data.  

3. **Copy Constructor**  
   - Used to copy data from another object.  
   - Java doesn’t provide it by default; we define it manually.

### 💡 **Example Concept**
When you create an object like `Student s1 = new Student(101, "Ravi");`,  
the constructor initializes the object’s `id` and `name`.

### 🧠 **Key Points**
- Constructors can be **overloaded** (multiple constructors with different parameters).  
- They **cannot be abstract, static, final, or synchronized**.  
- If you define your own constructor, the compiler does **not** create the default one.  
- Helps in controlling how objects are initialized and ensures proper setup.

---

## 🏷️ **03 — Static and This Keyword**

### ⚙️ **Static Keyword**

#### 📘 **Definition**
The `static` keyword is used for members that belong to the **class itself**, not to any object.  
It allows data and methods to be **shared across all objects**.

#### 🧠 **Purpose**
- To create **common data** shared by all instances of a class.  
- To call methods or access data **without creating an object**.  

#### 🔹 **Where It Can Be Used**
1. **Static Variables** — Shared among all objects.  
2. **Static Methods** — Belong to the class, can be called directly using `ClassName.methodName()`.  
3. **Static Blocks** — Used to initialize static data before any object is created.  

#### 💡 **Key Points**
- Memory for static members is allocated only once.  
- They are loaded when the class is first loaded into memory.  
- Static methods can **only access static variables** directly.  
- Static methods **cannot use `this` or `super` keywords**.  

#### 🧩 **Example Concept**
If all students belong to the same college, `college` can be a static variable —  
so changing it once updates for every student.

---

### ⚙️ **This Keyword**

#### 📘 **Definition**
The `this` keyword is a reference variable that refers to the **current object** in a method or constructor.

#### 🧠 **Purpose**
- To **differentiate** between instance variables and parameters with the same name.  
- To **call current class methods or constructors**.  
- To **return the current object** from a method.  

#### 💡 **Use Cases**
1. To refer to **instance variables** when local variables have the same name.  
2. To call another constructor from a constructor using `this()`.  
3. To pass the current object as an argument to another method.  
4. To return the current class instance.  

#### 🔹 **Key Points**
- `this` keyword always refers to the **object that invoked the method**.  
- It cannot be used in a **static context**.  
- It helps maintain **clear and readable** code, avoiding variable shadowing.  

---

## 📚 **Summary Table**

| Concept | Keyword | Belongs To | Purpose | Key Idea |
|----------|-----------|-------------|----------|----------|
| **Class** | `class` | Blueprint | Defines structure of objects | Template for data and behavior |
| **Object** | — | Instance | Represents real-world entity | Created using `new` |
| **Constructor** | same as class name | Object Initialization | Initializes object data | Called automatically |
| **Static** | `static` | Class-level | Shared among all objects | Memory allocated once |
| **This** | `this` | Current object | Refers to current instance | Removes naming conflict |

---

## ✨ **End of Day 3 Notes**
Next Topic → **Encapsulation** 🔒 (Coming in Day 4)
