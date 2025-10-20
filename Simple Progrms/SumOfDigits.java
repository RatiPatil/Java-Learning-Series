public class SumOfDigits {

  public static void main(String[] args) {
    int a = 234;
    int sum = 0;

    // Loop until all digits are processed
    while (a != 0) {
      int last_digit = a % 10; // Get the last digit
      sum = sum + last_digit;  // Add it to the sum
      a = a / 10;              // Remove the last digit
    }

    System.out.println("Sum of digits: " + sum);
  }
}
