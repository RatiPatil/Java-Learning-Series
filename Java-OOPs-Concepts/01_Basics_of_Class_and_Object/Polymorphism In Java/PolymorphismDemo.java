// Polymorphism Example in Java

// Compile-time Polymorphism (Method Overloading)
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Runtime Polymorphism (Method Overriding)
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        // Compile-time Polymorphism
        MathOperation obj = new MathOperation();
        System.out.println("Sum of integers: " + obj.add(5, 10));
        System.out.println("Sum of doubles: " + obj.add(2.5, 3.5));

        // Runtime Polymorphism
        Animal a;
        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
