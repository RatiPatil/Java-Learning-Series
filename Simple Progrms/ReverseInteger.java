public class ReverseInteger {
  public static void main(String[] args) {
    int a = 34523;  // original number
    int lastDigit = 0;  // to store the last digit
    int r = 0;  // to store the reversed number

    // repeat until all digits are reversed
    while (a != 0) {
      lastDigit = a % 10;       // get last digit
      r = r * 10 + lastDigit;   // build reversed number
      a = a / 10;               // remove last digit
    }

    System.out.println("Reversed number is: " + r);
  }
}
