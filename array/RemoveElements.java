import java.util.Arrays;

public class RemoveElements {
    public static int[] RemoveEle(int[] arr, int target) {
        if (arr.length == 0)
            return new int[0];
        int write = 0;
        for (int read = 0; read < arr.length; read++) {
            if (arr[read] != target) {
                arr[write] = arr[read];
                write++;
            }
        }
        return Arrays.copyOfRange(arr, 0, write);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 3, 4, 5, 6, 2, 3, 2, 9, 3 };
        int target = 3;
        int[] result = RemoveEle(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
