import java.util.Scanner;

public class Sum {

    public static int ArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;

        System.out.println("Enter Array Length: ");
        length = sc.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter " + (i + 1) + " value of an array: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println("Sum of an array: " + ArraySum(arr));

        sc.close();
    }
}
