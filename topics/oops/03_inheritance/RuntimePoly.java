import java.util.ArrayList;

class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = initialBalance;
    }

    public void calculateInterest() {
        System.out.println("calculating interest for generic accounts");
    }

    public void displayBalance() {
        System.out.println("current balance ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }
}

public class RuntimePoly {
    public static void main(String[] args) {

    }
}
