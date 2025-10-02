package topics.oops;

// Definition: Encapsulation is the practice of bundling data (variables) and methods (functions) that operate on that data into a single unit (class), while restricting direct access to some of the object's components.

class BankAccount {
    // Access Modifiers
    int amount; // default access modifiers
    protected int number;
    private double balance;
    private String accountNumber;

    public void deposit() {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

}

public class main {
    public static void main(String[] args) {

    }
}
