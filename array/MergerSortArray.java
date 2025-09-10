import java.util.Arrays;

public class MergerSortArray {
    public static int[] Merge(int[] arr1, int m, int[] arr2, int n) {
        int[] newArr = new int[n + m];
        System.arraycopy(arr1, 0, newArr, 0, m);
        System.arraycopy(arr2, 0, newArr, m, n);
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        int m = 3, n = 3;

        int[] result = Merge(arr1, m, arr2, n);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
