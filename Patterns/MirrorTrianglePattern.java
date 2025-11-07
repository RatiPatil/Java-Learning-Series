// Java program to print the mirror image of a triangle pattern (numbers)
public class MirrorTrianglePattern {
    public static void main(String[] args) {
        int n = 6; // number of rows
        printMirrorPattern(n);
    }

    // Function to print the mirror triangle pattern
    static void printMirrorPattern(int n) {

        // 🔹 Upper half of the pattern
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }

            // Print numbers from current row number to n
            for (int num = i; num <= n; num++) {
                System.out.print(num + " ");
            }

            System.out.println(); // move to next line
        }

        // 🔹 Lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {

            // Print leading spaces
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }

            // Print numbers again from current row number to n
            for (int num = i; num <= n; num++) {
                System.out.print(num + " ");
            }

            System.out.println(); // move to next line
        }
    }
}
