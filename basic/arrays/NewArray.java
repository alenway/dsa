import java.util.Arrays;

public class NewArray {
    public static int[] copy(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Null Values not allowed");
        }
        if (arr.length == 0) {
            return new int[0];
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] newArr = copy(arr);
        System.out.println(Arrays.toString(newArr));
    }
}
