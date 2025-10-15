import java.util.Scanner;

public class StudentMarksMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice; // 1 to continue, 0 to stop
        int marks;

        do {
            System.out.println("Enter 1 to continue or 0 to stop:");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter student's marks (0-100):");
                marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered!");
                }
            } else if (choice == 0) {
                System.out.println("Program terminated.");
            } else {
                System.out.println("Invalid choice! Enter 1 or 0.");
            }

        } while (choice != 0);

        sc.close();
    }
}
