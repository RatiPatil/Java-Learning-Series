IMPORTANT NOTES - ENCAPSULATION IN JAVA
---------------------------------------

1. Definition:
   Encapsulation is the process of binding data (variables) and methods into a single unit (class).
   It helps in data hiding and protecting the internal state of an object from unauthorized access.

2. How to Achieve Encapsulation:
   - Declare variables as private.
   - Provide public getter and setter methods to access and update private data.

3. Access Modifiers:
   - private   → Accessible only within the same class.
   - public    → Accessible from anywhere.
   - protected → Accessible within the same package and subclasses.
   - default   → Accessible within the same package only.

4. Advantages of Encapsulation:
   - Improves data security.
   - Provides control over data modification.
   - Makes code more flexible and maintainable.
   - Hides implementation details (data hiding).
   - Easier debugging and code reusability.

5. Example Code:
   -----------------------------------
   class Student {
       private String name;
       private int age;

       public void setName(String name) {
           this.name = name;
       }
       public String getName() {
           return name;
       }

       public void setAge(int age) {
           if (age > 0)
               this.age = age;
           else
               System.out.println("Invalid age!");
       }
       public int getAge() {
           return age;
       }
   }

   public class TestEncapsulation {
       public static void main(String[] args) {
           Student s = new Student();
           s.setName("Rati Patil");
           s.setAge(21);

           System.out.println("Name: " + s.getName());
           System.out.println("Age: " + s.getAge());
       }
   }
   -----------------------------------

6. Output:
   Name: Rati Patil
   Age: 21

7. Real-World Example:
   Think of a capsule — it hides the medicine inside.
   Similarly, encapsulation hides data inside a class and only exposes necessary methods.

8. Key Points to Remember:
   - Use getters and setters for private variables.
   - Direct variable access (e.g., obj.name) is not allowed if private.
   - Encapsulation is also known as data hiding.
   - Helps in achieving modular and secure code design.

9. Summary:
   -----------------------------------
   | Concept           | Description                         |
   |-------------------|-------------------------------------|
   | OOPs Principle    | Encapsulation                       |
   | Purpose           | Data hiding and protection           |
   | How Achieved      | private + getter/setter methods      |
   | Real-world Example| Medicine capsule                     |
   | Benefits          | Security, Flexibility, Maintainable  |
   -----------------------------------
