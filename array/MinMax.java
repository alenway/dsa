import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void minmax(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int minarray = min(arr);
        int maxarray = max(arr);
        System.out.println("Smallest Element in an Array: " + minarray);
        System.out.println("Largest Element in an Array: " + maxarray);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = { 4, 7, 5, 2, 8, 9, 3, 2, 6 };
        minmax(arr);
    }
}
