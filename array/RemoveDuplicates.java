import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] duplicates(int[] arr) {
        if (arr.length == 0)
            return new int[0];
        int write = 1;
        for (int read = 1; read < arr.length; read++) {
            if (arr[read] != arr[read - 1]) {
                arr[write] = arr[read];
                write++;
            }
        }
        return Arrays.copyOfRange(arr, 0, write);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] value = duplicates(arr);
        System.out.println(Arrays.toString(value));
    }
}
