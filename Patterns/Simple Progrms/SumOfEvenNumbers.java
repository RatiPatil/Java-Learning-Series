public class SumOfEvenNumbers {

  public static void main(String[] args) {
    int a = 10;
    int sum = 0;

    for (int i = 1; i <= a; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
      }
    }

    System.out.println("Sum of even numbers from 1 to " + a + " is: " + sum);
  }

}
