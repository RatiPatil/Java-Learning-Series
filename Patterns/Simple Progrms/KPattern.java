import java.util.Scanner;

public class KPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Upper half of K
        for (int i = n; i >= 1; i--) {
            System.out.print("* ");
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        // Lower half of K
        for (int i = 2; i <= n; i++) {
            System.out.print("* ");
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        sc.close();
    }
}
