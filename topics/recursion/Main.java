public class Main {
    // public static int factorial(int number) {
    // int factorial = 1;
    // for (int i = 1; i <= number; i++) {
    // factorial *= i;
    // }
    // return factorial;
    // }
    public static int factorial(int number) {
        if (number == 1)
            return 1;
        return number * factorial(number - 1);

    }

    public static void main(String[] args) {
        int number = 4;
        System.out.println(factorial(number));
    }
}
