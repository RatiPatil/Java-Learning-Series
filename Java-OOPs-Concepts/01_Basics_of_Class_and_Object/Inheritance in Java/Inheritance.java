// Inheritance.java
// Demonstration of Inheritance in Java

class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating...");
    }

    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Derived Class
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking...");
    }
}

// Multi-level Inheritance
class Puppy extends Dog {
    void play() {
        System.out.println(name + " is playing...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.name = "Buddy";

        // Accessing parent class methods
        puppy.eat();
        puppy.sleep();

        // Accessing child class methods
        puppy.bark();
        puppy.play();
    }
}
