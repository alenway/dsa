import java.util.Arrays;

public class NewArray2 {
    public static int[] copy(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Null value is not allowed.");
        }
        if (arr.length == 0) {
            return new int[0];
        }
        return Arrays.copyOf(arr, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] result = copy(arr);
        System.out.println(Arrays.toString(result));
    }
}
