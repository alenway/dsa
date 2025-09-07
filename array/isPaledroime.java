import java.util.Scanner;

public class isPaledroime {
    public static void palendrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter lenght: ");
        int lenght = scan.nextInt();

        int[] arr = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.print("Enter array value: ");
            arr[i] = scan.nextInt();
        }

        palendrome(arr);
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        scan.close();
    }
}
