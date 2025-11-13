# Polymorphism in Java

## Definition
Polymorphism means "many forms" — it allows the same method or object to behave differently.

---

## Types of Polymorphism
### 1. Compile-time Polymorphism (Method Overloading)
- Occurs when multiple methods have the same name but different parameters.
- The decision is made during compilation.

### 2. Runtime Polymorphism (Method Overriding)
- Occurs when a subclass provides a specific implementation of a method already defined in its parent class.
- The method that is called is determined at runtime.

---

## Syntax Examples
**Method Overloading:**
```java
int add(int a, int b)
double add(double a, double b)
