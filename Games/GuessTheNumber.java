package Games;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("=== Guess The Number ===");
        System.out.println("I will choose a number between 1 and 100.");
        System.out.println("Try to guess it. Type '0' anytime to quit.\n");

        boolean playAgain = true;

        while (playAgain) {
            int secret = rnd.nextInt(100) + 1; // 1..100
            int attempts = 0;
            boolean guessed = false;

            System.out.println("New round! You have unlimited attempts (but try to be efficient).");

            while (!guessed) {
                System.out.print("Enter your guess (1-100, or 0 to quit): ");
                String line = sc.nextLine().trim();

                // input validation
                int guess;
                try {
                    guess = Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                    continue;
                }

                if (guess == 0) {
                    System.out.println("You chose to quit. Goodbye!");
                    sc.close();
                    return;
                }
                if (guess < 1 || guess > 100) {
                    System.out.println("Guess must be between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guess == secret) {
                    System.out.printf("🎉 Correct! The number was %d. You took %d %s.%n",
                                      secret, attempts, attempts == 1 ? "attempt" : "attempts");
                    guessed = true;
                } else if (guess < secret) {
                    System.out.println("Too low. Try a higher number.");
                } else {
                    System.out.println("Too high. Try a lower number.");
                }
            }

            // give a performance message
            if (attempts <= 3) {
                System.out.println("Excellent! You're a natural guesser. 🔥");
            } else if (attempts <= 7) {
                System.out.println("Nice work! Not bad at all. 🙂");
            } else {
                System.out.println("Persistence pays off — good job! 💪");
            }

            // ask to play again
            System.out.print("Play again? (y/n): ");
            String again = sc.nextLine().trim().toLowerCase();
            playAgain = again.equals("y") || again.equals("yes");
            System.out.println();
        }

        System.out.println("Thanks for playing Guess The Number. Bye!");
        sc.close();
    }
}
