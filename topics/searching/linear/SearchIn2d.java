import java.util.Arrays;

public class SearchIn2d {
    public static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // int[][] arr = {
        // { 23, 4, 1 },
        // { 18, 12, 3, 9 },
        // { 78, 99, 34, 56 },
        // { 18, 12 },
        // };
        // int target = 3;
        // int[] ans = search(arr, target);
        // int max = max(arr);
        // System.out.println(Arrays.toString(ans));
        // System.out.println("Max value in the array: " + max);
        int n = 123;
        int temp = n;
        int count = 0;
        while (temp > 0) {
            int digit = temp % 10;
            temp = temp / 10;
            count++;
        }
        System.out.println(count);
    }
}
