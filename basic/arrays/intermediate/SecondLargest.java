public class SecondLargest {
    public static int sl(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Null value is not allowed");
        }
        if (arr.length == 0) {
            return 0;
        }
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No Second Largest Element Exists.");
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 7, 3, 5, 9, 8 };
        int result = sl(arr);
        System.out.println(result);
    }
}
