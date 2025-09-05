import java.util.Scanner;

public class ArraySumR {

    public static int Rsa(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + Rsa(arr, index + 1);
    }

    public static void sumarr(int[] arr) {
        int ans;
        ans = Rsa(arr, 0);
        System.out.println("Array Sum: " + ans);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lenght of an Array: ");
        int length = scan.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter Arrays" + (i + 1) + "th value: ");
            array[i] = scan.nextInt();
        }

        sumarr(array);
    }
}
