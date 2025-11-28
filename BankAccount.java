abstract class BankAccount {
    protected String accountHolderName;
    protected double balance;

    // Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Common method to display balance
    public void displayBalance() {
        System.out.println(accountHolderName + "'s current balance: " + balance + " BDT");
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate = 0.03; // 3% annual interest

    public SavingsAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " BDT to Savings Account.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " BDT from Savings Account.");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest + " BDT");
    }
}

// Subclass CurrentAccount
class CurrentAccount extends BankAccount {
    private double overdraftLimit = 5000.0; // can withdraw extra up to this limit

    public CurrentAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " BDT to Current Account.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " BDT from Current Account.");
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount!");
        }
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Create SavingsAccount object
        SavingsAccount savings = new SavingsAccount("Eva Chowdhury", 10000);
        System.out.println("=== Savings Account ===");
        savings.deposit(2000);
        savings.withdraw(1500);
        savings.addInterest();
        savings.displayBalance();

        System.out.println();

        // Create CurrentAccount object
        CurrentAccount current = new CurrentAccount("John Rahman", 5000);
        System.out.println("=== Current Account ===");
        current.deposit(3000);
        current.withdraw(9000); // within overdraft limit
        current.displayBalance();
    }
}