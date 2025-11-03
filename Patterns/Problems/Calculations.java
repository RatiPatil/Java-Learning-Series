// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

import java.util.*;

public class Calculations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, operation;

    System.out.println("Enter your first number:");
    a = sc.nextInt();

    System.out.println("Enter your second number:");
    b = sc.nextInt();

    System.out.println("Enter operation to be performed:");
    System.out.println("1 = Addition");
    System.out.println("2 = Subtraction");
    System.out.println("3 = Multiplication");
    System.out.println("4 = Division");
    System.out.println("5 = Modulo");

    System.out.print("Enter your choice: ");
    operation = sc.nextInt();

    switch (operation) {
      case 1:
        System.out.println("The Addition of two numbers is: " + (a + b));
        break;
      case 2:
        System.out.println("The Subtraction of two numbers is: " + (a - b));
        break;
      case 3:
        System.out.println("The Multiplication of two numbers is: " + (a * b));
        break;
      case 4:
        if (b != 0) {
          System.out.println("The Division of two numbers is: " + (a / b));
        } else {
          System.out.println("Error: Division by zero is not allowed.");
        }
        break;
      case 5:
        if (b != 0) {
          System.out.println("The Modulo of two numbers is: " + (a % b));
        } else {
          System.out.println("Error: Modulo by zero is not allowed.");
        }
        break;
      default:
        System.out.println("Enter a valid operation (1–5)");
        break;
    }

    sc.close();
  }
}


// Second Method


// import java.util.*;

// public class other3 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     int a;
//     int b;
//     char opret;

//     System.out.print("Enter first number: ");
//     a = sc.nextInt();

//     System.out.print("Enter second number: ");
//     b = sc.nextInt();

//     System.out.print("Enter operation to be performed (+, -, *, /, %): ");
//     opret = sc.next().charAt(0);

//     if (opret == '+') {
//       System.out.println("The Addition of Two Numbers is: " + (a + b));
//     } else if (opret == '-') {
//       System.out.println("The Subtraction of Two Numbers is: " + (a - b));
//     } else if (opret == '*') {
//       System.out.println("The Multiplication of Two Numbers is: " + (a * b));
//     } else if (opret == '/') {
//       if (b != 0) {
//         System.out.println("The Division of Two Numbers is: " + (a / b));
//       } else {
//         System.out.println("Error: Division by zero is not allowed.");
//       }
//     } else if (opret == '%') {
//       if (b != 0) {
//         System.out.println("The Modulo of Two Numbers is: " + (a % b));
//       } else {
//         System.out.println("Error: Modulo by zero is not allowed.");
//       }
//     } else {
//       System.out.println("Enter a valid operation (+, -, *, /, %)");
//     }
//     sc.close();
//   }
// }
