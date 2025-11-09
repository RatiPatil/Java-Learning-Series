// Java Program to demonstrate Constructors

class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called");
    }

    // Copy Constructor (manually created)
    Student(Student s) {
        name = s.name;
        age = s.age;
        System.out.println("Copy constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorsExample {
    public static void main(String[] args) {
        // Default Constructor
        Student s1 = new Student();
        s1.display();

        // Parameterized Constructor
        Student s2 = new Student("Rati", 21);
        s2.display();

        // Copy Constructor
        Student s3 = new Student(s2);
        s3.display();
    }
}
