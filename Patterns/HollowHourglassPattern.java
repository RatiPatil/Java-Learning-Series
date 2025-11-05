// Java Program to print Hollow Hourglass Pattern
public class HollowHourglassPattern {

    // Function to print the pattern
    public static void printPattern(int n) {

        // Upper half of the hourglass
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars and inner spaces
            for (int j = i; j <= n; j++) {
                if (j == i || j == n || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Lower half of the hourglass
        for (int i = n - 1; i >= 1; i--) {

            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars and inner spaces
            for (int j = i; j <= n; j++) {
                if (j == i || j == n || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = 6; // Change this value to adjust pattern size
        printPattern(n);
    }
}
