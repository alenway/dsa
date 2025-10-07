class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 8.4;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 7.3;
    }

    // Method overloading
    double getInterestRate(boolean isSeniorCitizen) {
        return isSeniorCitizen ? 7.8 : 7.3;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Runtime polymorphism
        Bank bank1 = new SBI(); // Upcasting
        Bank bank2 = new ICICI(); // Upcasting

        System.out.println("SBI Rate: " + bank1.getInterestRate());
        System.out.println("ICICI Rate: " + bank2.getInterestRate());

        // Downcasting to use subclass-specific method
        if (bank2 instanceof ICICI) {
            ICICI icici = (ICICI) bank2;
            System.out.println("ICICI Senior Citizen Rate: " +
                    icici.getInterestRate(true));
        }
    }
}
