// Program: Demonstrate Class and Object with Student Example
// Author: Ratikant Ashok Patil
// Date: 08-Nov-2025
// Description: Simple example showing multiple objects and method calling.


// Define Student class
class Student {
    // Data members (variables)
    int id;
    String name;

    // Member function to display data
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}


// Main class containing main() method
public class StudentDemo {
    public static void main(String[] args) {

        // Create first student object
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Ratikant";

        // Create second student object
        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Akash";

        // Display both students' information
        s1.display();
        s2.display();
    }
}
