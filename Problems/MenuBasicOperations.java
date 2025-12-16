import java.util.Scanner;

public class MenuBasicOperations {

    // Function for factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to reverse a number
    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Factorial");
            System.out.println("6. Check Even or Odd");
            System.out.println("7. Reverse a Number");
            System.out.println("8. Exit");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter two numbers: ");
                    int a1 = sc.nextInt();
                    int b1 = sc.nextInt();
                    System.out.println("Result: " + (a1 + b1));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    int a2 = sc.nextInt();
                    int b2 = sc.nextInt();
                    System.out.println("Result: " + (a2 - b2));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    int a3 = sc.nextInt();
                    int b3 = sc.nextInt();
                    System.out.println("Result: " + (a3 * b3));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    int a4 = sc.nextInt();
                    int b4 = sc.nextInt();
                    if (b4 != 0)
                        System.out.println("Result: " + (a4 / b4));
                    else
                        System.out.println("Cannot divide by zero!");
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println("Factorial: " + factorial(num));
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    if (n % 2 == 0)
                        System.out.println(n + " is Even");
                    else
                        System.out.println(n + " is Odd");
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    int revNum = sc.nextInt();
                    System.out.println("Reversed Number: " + reverse(revNum));
                    break;

                case 8:
                    System.out.println("Exiting program... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}
