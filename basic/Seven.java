import java.util.Scanner;

public class Seven {

    public static double calculateSimpleIntereset(double principle, double rate, double time) {
        return (principle * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double si, principle, rate, time;
        System.out.println("Enter Principle amount: ");
        principle = scan.nextInt();
        System.out.println("Enter Rate of Intereser %:");
        rate = scan.nextInt();
        System.out.println("Enter Time duration: ");
        time = scan.nextInt();

        si = calculateSimpleIntereset(principle, rate, time);

        System.out.println(si);
        scan.close();

    }
}
