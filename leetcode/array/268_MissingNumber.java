import java.util.Arrays;

class MissingNumber {
    public static int max(int[] arr) {
        // Arrays.sort(arr);
        // for (int index = 0; index < arr.length; index++) {
        // if (index != arr[index]) {
        // return index;
        // }
        // }
        // return -1;

        // int n = arr.length;
        // int expectedSum = n * (n + 1) / 2;
        // int actualsum = 0;

        // for (int item : arr) {
        // actualsum += item;
        // }

        // return expectedSum - actualsum;

        int result = arr.length;

        for (int i = 0; i < arr.length; i++) {
            result ^= i ^ arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 4, 2 };
        int result = max(arr);
        System.out.println(result);
    }
}
