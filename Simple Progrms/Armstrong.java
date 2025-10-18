import java.util.*;

public class Armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;
    int sum = 0;
    int last_digit;
    int temp;

    System.out.println("Enter a number to cheak Armstrong or not :");
    num = sc.nextInt();
    temp = num;

    while (num != 0) {
      last_digit = num % 10;
      sum = last_digit * last_digit * last_digit + sum;
      num = num / 10;
    }

    if (temp == sum) {
      System.out.println("Armstrong Number");
    } else {
      System.out.println("Not Armstrong Number");
    }

  }
}
