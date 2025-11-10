// Java Program to demonstrate Static and This keyword

class Student {
    int rollNo;
    String name;
    static String college = "MIT"; // static variable shared by all objects

    // Constructor using 'this' keyword
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    // Display method
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticAndThisExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ravi");
        Student s2 = new Student(102, "Priya");

        s1.display();
        s2.display();

        // Changing static variable via static method
        Student.changeCollege("IIT");

        s1.display();
        s2.display();
    }
}

/*
--------- OUTPUT ---------
101 Ravi MIT
102 Priya MIT
101 Ravi IIT
102 Priya IIT
--------------------------
*/
