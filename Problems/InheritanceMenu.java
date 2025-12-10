import java.util.Scanner;

// Parent Class
class Person {
    String name;
    int age;

    void inputPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Child Class 1 (Inheritance → Person → Student)
class Student extends Person {
    int roll;

    void inputStudent(String name, int age, int roll) {
        inputPerson(name, age);  // calling parent method
        this.roll = roll;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll : " + roll);
    }
}

// Child Class 2 (Multi-level → Person → Student → Result)
class Result extends Student {
    int marks;

    void inputResult(String name, int age, int roll, int marks) {
        inputStudent(name, age, roll);
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "Fail";
    }

    void displayResult() {
        displayStudent();
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

// Main Class - Menu Driven Program
public class InheritanceMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Show Student Details");
            System.out.println("3. Show Grade");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    sc.nextLine(); // clear buffer
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    r.inputResult(name, age, roll, marks);
                    System.out.println("✔ Details Saved Successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Student Details ---");
                    r.displayResult();
                    break;

                case 3:
                    System.out.println("\nGrade: " + r.calculateGrade());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
