// Interface Example in Java


interface Animal {
void sound(); // abstract method
void eat(); // abstract method
}


interface Pet {
void play();
}


class Dog implements Animal, Pet {
@Override
public void sound() {
System.out.println("Dog barks");
}


@Override
public void eat() {
System.out.println("Dog eats bones");
}


@Override
public void play() {
System.out.println("Dog loves to play fetch");
}
}


public class InterfaceExample {
public static void main(String[] args) {
Dog dog = new Dog();


dog.sound();
dog.eat();
dog.play();
}
}