import java.util.Scanner;

public class MenuProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Displaying Menu
            System.out.println("\n======= MENU =======");
            System.out.println("1. Calculate Simple Interest");
            System.out.println("2. Find Factorial");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Exit");
            System.out.println("====================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Principal Amount: ");
                    double p = sc.nextDouble();
                    System.out.print("Enter Rate of Interest: ");
                    double r = sc.nextDouble();
                    System.out.print("Enter Time (in years): ");
                    double t = sc.nextDouble();

                    double si = (p * r * t) / 100;
                    System.out.println("Simple Interest: " + si);
                    break;

                case 2:
                    System.out.print("Enter a number to find factorial: ");
                    int num = sc.nextInt();
                    long factorial = 1;
                    
                    for (int i = 1; i <= num; i++) {
                        factorial *= i;
                    }
                    
                    System.out.println("Factorial of " + num + " is: " + factorial);
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    boolean isPrime = true;

                    if (n <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= n / 2; i++) {
                            if (n % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime) {
                        System.out.println(n + " is a Prime Number.");
                    } else {
                        System.out.println(n + " is NOT a Prime Number.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter between 1 to 4.");
            }

        } while(choice != 4);

        sc.close();
    }
}
