import java.util.Scanner;

public class StringMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        do {
            System.out.println("\n----- STRING OPERATIONS MENU -----");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Compare with Another String");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.println("Length of string: " + str.length());
                    break;

                case 2:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;

                case 3:
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 4:
                    String reversed = new StringBuilder(str).reverse().toString();
                    System.out.println("Reversed String: " + reversed);
                    break;

                case 5:
                    System.out.print("Enter string to compare: ");
                    String str2 = sc.nextLine();
                    if (str.equals(str2)) {
                        System.out.println("Both strings are SAME.");
                    } else {
                        System.out.println("Strings are DIFFERENT.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting... Thank You!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
