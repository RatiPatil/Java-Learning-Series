import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        // Loop to calculate sum of first n natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i;  // sum = sum + i
        }

        // Display the result
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        
        sc.close();
    }
}
