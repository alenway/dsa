interface MathOperations {
    double calculate(double a, double b);

    // Static method
    static void printInfo() {
        System.out.println("Math Operations Interface");
        helperMethod(); // Can call private static methods
    }

    // Private static method
    private static void helperMethod() {
        System.out.println("Helper method for static operations");
    }
}

class Calculator implements MathOperations {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // Usage
        MathOperations.printInfo(); // Called on interface, not implementation
    }
}
