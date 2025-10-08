public class Palindrom {
  public static void main(String[] args) {
    int a = 128;
    int rev = 0;
    int last_digit = 0;
    int temp;

    temp = a;

    while (a != 0) {
      last_digit = a % 10;
      rev = rev * 10 + last_digit;
      a = a / 10;

    }

    if (temp == rev) {
      System.out.println("Palindrom");
    } else {
      System.out.println("Not a Palindrom");
    }
  }
}