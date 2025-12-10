// Example of Encapsulation in Java

class Student {
    // private data members (data hiding)
    private String name;
    private int age;

    // getter method for name
    public String getName() {
        return name;
    }

    // setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // getter method for age
    public int getAge() {
        return age;
    }

    // setter method for age
    public void setAge(int age) {
        if (age > 0) { // simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s1 = new Student();

        // setting values using setter methods
        s1.setName("Rati Patil");
        s1.setAge(21);

        // accessing values using getter methods
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
    }
}
