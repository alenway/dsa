public class fibonacci {
    public static void Fibo(int n) {
        int a = 0, b = 1; // first two terms
        for (int i = 0; i <= n; i++) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        int num = 5;
        Fibo(num);
    }
}
