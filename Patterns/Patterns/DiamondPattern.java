import java.util.Scanner;

public class DiamondPattern {
    // n = number of rows in upper half (including middle). n >= 1
    public static void printDiamond(int n) {
        // upper half (including middle row)
        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int s = 0; s < n - i; s++)
                System.out.print(" ");
            // print stars: 2*i - 1
            for (int j = 0; j < 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }

        // lower half (excluding middle row)
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 0; s < n - i; s++)
                System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (e.g., 5): ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("n must be >= 1");
        } else {
            printDiamond(n);
        }
        sc.close();
    }
}
