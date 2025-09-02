import java.util.Scanner;

public class Five {

    // method to calculate factorial
    public int factorial(int value) {
        int fact = 1;
        for (int i = 1; i <= value; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any number for factorial: ");
        int value = scan.nextInt();

        Five obj = new Five(); // create object of the same class
        int result = obj.factorial(value);

        System.out.println("Factorial of " + value + " is: " + result);
        scan.close();
    }
}
