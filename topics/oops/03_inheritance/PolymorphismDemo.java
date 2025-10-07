class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to be overridden
    public void calculateInterest() {
        System.out.println("Calculating interest for generic account");
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    // Method overriding
    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Savings account interest: $" + interest);
    }
}

class CheckingAccount extends BankAccount {
    private double monthlyFee;

    public CheckingAccount(double initialBalance, double monthlyFee) {
        super(initialBalance);
        this.monthlyFee = monthlyFee;
    }

    // Method overriding
    @Override
    public void calculateInterest() {
        balance -= monthlyFee;
        System.out.println("Checking account fee deducted: $" + monthlyFee);
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Runtime polymorphism
        BankAccount account1 = new SavingsAccount(1000, 0.05);
        BankAccount account2 = new CheckingAccount(500, 10);

        // The correct overridden method is called at runtime
        account1.calculateInterest(); // Calls SavingsAccount version
        account2.calculateInterest(); // Calls CheckingAccount version

        // Array of different account types
        BankAccount[] accounts = {
                new SavingsAccount(2000, 0.04),
                new CheckingAccount(800, 15),
                new SavingsAccount(3000, 0.06)
        };

        // Polymorphic behavior
        for (BankAccount account : accounts) {
            account.calculateInterest();
            account.displayBalance();
            System.out.println("---");
        }
    }
}
