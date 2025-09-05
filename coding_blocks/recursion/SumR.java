import java.util.Scanner;

public class SumR {
    public static int ArraySum(int[] arr, int index) {
        if (index == arr.length) {
            return 0; // base case
        }
        return arr[index] + ArraySum(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of an Array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter " + (i + 1) + " value of an array: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + (i < length - 1 ? ", " : ""));
        }

        System.out.println("\nSum of an array: " + ArraySum(arr, 0));
    }
}
