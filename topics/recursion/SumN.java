import java.util.Scanner;

public class SumN {
        public static int sum(int value) {
                if (value == 0)
                        return 0;
                return value + sum(value - 1);
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a value: ");
                int value = sc.nextInt();
                System.out.println(sum(value));
                sc.close();
        }
}
