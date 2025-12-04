import java.util.Scanner;

class BankAccount {
    
    private String name;
    private long accountNumber;
    private double balance;

    // Constructor
    BankAccount(String name, long accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount){
        balance += amount;
        System.out.println("Amount Deposited Successfully.");
    }

    // Withdraw method
    void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdraw Successful.");
        }
    }

    // Show Balance
    void showBalance(){
        System.out.println("Current Balance: ₹" + balance);
    }

    // Display Account Information
    void displayDetails(){
        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number     : " + accountNumber);
        System.out.println("Balance            : ₹" + balance);
    }
}

public class BankMenuProgram {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Create account first
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();
        
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        BankAccount account = new BankAccount(name, accNo, bal);

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double w = sc.nextDouble();
                    account.withdraw(w);
                    break;

                case 3:
                    account.showBalance();
                    break;

                case 4:
                    account.displayDetails();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice! Try again.");
            }

        } while(choice != 5);

        sc.close();
    }
}
