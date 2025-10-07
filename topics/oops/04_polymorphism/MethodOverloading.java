class Calculator {
    // Method overloading - same name, different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;

    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(5, 10, 6);
    }
}
