import java.util.Arrays;

public class ReverseArray2 {
    public static int[] reverse(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        if (arr.length == 0) {
            return new int[0];
        }
        int temp, length = arr.length;
        for (int i = 0, j = length - 1; i < j; i++, j--) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));
    }
}
