/*  Variables & Data Types

Variables
A variable is a container (storage area) used to hold data.  
Each variable should be given a unique name (identifier).  




Data Types
Data types are declarations for variables. This determines the type and size of  data associated with variables which is essential to know since different data  types occupy different sizes of memory.

There are 2 types of Data Types :
Primitive Data types : to store simple values
Non-Primitive Data types : to store complex values

	Primitive Data Types
	These are the data types of fixed size.


  Non-Primitive Data Types
	These are of variable size & are usually declared with a ‘new’ keyword.

	Eg : String, Arrays

	String name = new String("Ratikant");
int[] marks = new int[3];
marks[0] = 97;
marks[1] = 98;
marks[2] = 95;

Constants
A constant is a variable in Java which has a fixed value i.e. it cannot be assigned a different value once assigned.

To declare a constant, use the 'final' keyword before the data type.
 */

/*Input Values  
 Scanner Scanner = new Scanner(System.in);// Create a Scanner object
 int a ;
 int b ;

 a = scanner.nextInt(); // Read user input
 b = scanner.nextInt(); // Read user input
 int sum = a + b; // Calculate the sum of two numbers
 System.println("Sum is: " + sum); // Output the sum
 scanner.close(); // Close the scanner
*/

import java.util.*;

public class Lecture2 {
  public static void main(String[] args) {
    int a = 10; // Integer (whole number without decimal)
    float b = 20.5f; // Floating point number (number with decimal)
    char c = 'A'; // Character (single character in single quotes)
    boolean d = true; // Boolean (true or false)
    double e = 30.123456; // Double (number with decimal, more precision than float)
    long f = 123456789L; // Long (large whole number)
    short g = 32000; // Short (smaller range whole number)
    byte h = 100; // Byte (very small range whole number)

    System.out.println("Integer: " + a);
    System.out.println("Float: " + b);
    System.out.println("Character: " + c);
    System.out.println("Boolean: " + d);
    System.out.println("Double: " + e);
    System.out.println("Long: " + f);
    System.out.println("Short: " + g);
    System.out.println("Byte: " + h);

    // Scanner Functionality

    // Input values example
    Scanner scanner = new Scanner(System.in); // Create a Scanner object
    int x;
    int y;

    System.out.print("Enter first number: ");
    x = scanner.nextInt(); // Read user input
    System.out.print("Enter second number: ");
    y = scanner.nextInt(); // Read user input
    int sum = x + y; // Calculate the sum of two numbers
    System.out.println("Sum is: " + sum); // Output the sum
    scanner.close(); // Close the scanner
  }

}
