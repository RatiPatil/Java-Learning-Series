import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter Student Name: ");
            String name = sc.next();

            System.out.print("Enter Marks (0-100): ");
            int marks = sc.nextInt();

            String grade;

            // Simple if-else
            if (marks >= 90)
                grade = "A+";
            else if (marks >= 80)
                grade = "A";
            else if (marks >= 70)
                grade = "B";
            else if (marks >= 60)
                grade = "C";
            else if (marks >= 50)
                grade = "D";
            else
                grade = "Fail";

            System.out.println("\n----- Report Card -----");
            System.out.println("Student Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);

            // Simple switch
            switch (grade) {
                case "A+":
                case "A":
                    System.out.println("Excellent!");
                    break;
                case "B":
                    System.out.println("Good work!");
                    break;
                case "C":
                case "D":
                    System.out.println("You can improve.");
                    break;
                default:
                    System.out.println("Better luck next time.");
            }

            System.out.print("\nDo you want to check another student? (y/n): ");
            choice = sc.next().charAt(0);
            System.out.println();

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using Grade Calculator!");
    }
}
