import java.util.Scanner;

public class Reverse {

    public static int rever(int[] arr) {

    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        rever(arr);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = { 2, 4, 1, 7, 4, 8, 5, 9, 6 };
        reverse(arr);
    }
}
