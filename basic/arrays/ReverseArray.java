import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        if (arr.length == 0) {
            return new int[0];
        }
        int length = arr.length;
        int[] newArr = new int[length];
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            newArr[j] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));
    }
}
