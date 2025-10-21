public class CountDigits {
  public static void main(String[] args) {
    int num = 45862;
    int count = 0;

    while (num != 0) {
      num = num / 10; // remove last digit
      count++; // increase count
    }

    System.out.println("Total digits: " + count);
  }
}

// test