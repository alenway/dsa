public class AverageOfArray {

    public static int average(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / (arr.length + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int result = average(arr);
        System.out.println(result);
    }
}
