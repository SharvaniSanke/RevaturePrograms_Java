import java.util.Scanner;

public class BankAccount {
    String name;
    String accountNumber;
    double balance;
    double MIN_BALANCE = 500.0;
    public void createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your account number: ");
        accountNumber = sc.nextLine();
        balance = MIN_BALANCE;
        System.out.println("Account created successfully with " + balance);
    }
    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit ");
        double amount = sc.nextDouble();
        System.out.println("Deposited ₹" + amount);
        balance += amount;
        System.out.println("Total Balance after deposite " + balance);
    }
    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
            System.out.println("Total balance after withdraw " + balance);
        }

        else {
            System.out.println("Insufficient balance");
        }
    }
    public void printBalanceSheet() {
        System.out.println("\n Balance Sheet");
        System.out.println("------------------------");
        System.out.println("Name           : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Available Balance: " + balance);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.createAccount();
        account.deposit();
        account.withdraw();
        account.printBalanceSheet(); // Method 4
    }
}
