import java.util.Scanner;

public class Fibo {
        public static void fibo(int n) {
                if (n == 1)
                        return;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n;
                System.out.print("Enter position of factorial: ");
                n = sc.nextInt();
                fibo(n);
                sc.close();
        }
}
