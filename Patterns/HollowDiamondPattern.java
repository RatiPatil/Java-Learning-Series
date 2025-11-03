public class HollowDiamondPattern {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // print stars and spaces between
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // print stars and spaces between
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
