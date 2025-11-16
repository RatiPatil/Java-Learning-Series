// Palindrome Triangle Pattern in Java
public class PalindromeTriangle {

    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int space = 1; space <= (n - i); space++) {
                System.out.print("  "); 
            }

            // Print descending numbers
            for (int num = i; num >= 1; num--) {
                System.out.print(num + " ");
            }

            // Print ascending numbers
            for (int num = 2; num <= i; num++) {
                System.out.print(num + " ");
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6; // height of triangle
        printPattern(n);
    }
}
