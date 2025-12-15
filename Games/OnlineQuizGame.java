import java.util.Scanner;

public class OnlineQuizGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which language is platform independent?",
            "2. Which keyword is used to inherit a class in Java?",
            "3. Which method is the entry point of Java program?",
            "4. Which data type is used to store true or false?",
            "5. Which operator is used for logical AND?"
        };

        String[][] options = {
            {"A. C", "B. C++", "C. Java", "D. Python"},
            {"A. this", "B. super", "C. extends", "D. implements"},
            {"A. start()", "B. run()", "C. main()", "D. init()"},
            {"A. int", "B. boolean", "C. char", "D. float"},
            {"A. &", "B. |", "C. &&", "D. ||"}
        };

        char[] answers = {'C', 'C', 'C', 'B', 'C'};
        char userAnswer;
        int score = 0;

        System.out.println("=================================");
        System.out.println("        JAVA QUIZ GAME  ");
        System.out.println("=================================");

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            userAnswer = sc.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct Answer ✔");
                score++;
            } else {
                System.out.println("Wrong Answer ❌");
                System.out.println("Correct Answer is: " + answers[i]);
            }

            System.out.println("---------------------------------");
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + " out of " + questions.length);

        if (score == questions.length) {
            System.out.println("Excellent Performance 🎉");
        } else if (score >= 3) {
            System.out.println("Good Job 👍");
        } else {
            System.out.println("Needs Improvement 💪");
        }

        sc.close();
    }
}
