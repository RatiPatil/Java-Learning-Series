import java.util.Scanner;

class RestaurantMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        int bill = 0;

        do {
            System.out.println("\n------ RESTAURANT MENU ------");
            System.out.println("1. Pizza   - ₹150");
            System.out.println("2. Burger  - ₹80");
            System.out.println("3. Coffee  - ₹50");
            System.out.println("4. Show Bill");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bill += 150;
                    System.out.println("Pizza added to your order.");
                    break;

                case 2:
                    bill += 80;
                    System.out.println("Burger added to your order.");
                    break;

                case 3:
                    bill += 50;
                    System.out.println("Coffee added to your order.");
                    break;

                case 4:
                    System.out.println("Total Bill: ₹" + bill);
                    break;

                case 5:
                    System.out.println("Thank you! Visit again.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);
    }
}
