import java.util.Arrays;
import java.util.Scanner;

public class InputPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = scan.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter " + (i + 1) + " array element: ");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}
