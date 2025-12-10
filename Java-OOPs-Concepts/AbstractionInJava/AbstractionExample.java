// Abstraction Example in Java

// Abstract class
abstract class Animal {
    abstract void sound(); // abstract method (no body)

    void sleep() { // non-abstract method
        System.out.println("This animal is sleeping...");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();

        System.out.println();

        Animal cat = new Cat();
        cat.sound();
        cat.sleep();
    }
}
