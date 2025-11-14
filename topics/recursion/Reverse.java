import java.util.Scanner;

public class Reverse {
        public static void reverse(int n) {
                if (n == 0)
                        return;
                System.out.print(n + " ");
                reverse(n - 1);
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int n = sc.nextInt();
                reverse(n);
                System.out.println();
                sc.close();
        }
}
