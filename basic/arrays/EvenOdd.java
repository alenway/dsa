public class EvenOdd {
    public static int[] countEvenOdd(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot null.");
        }
        if (arr.length == 0) {
            return new int[] { 0, 0 };
        }
        int even = 0, odd = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                even++;
            } else if (item % 2 == 1 || item % 2 == -1) {
                odd++;
            } else {
                System.out.println("Unexpected Number" + item);
            }
        }
        return new int[] { even, odd };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 3, 2, 4, 6, 7, 9, 8, 2, 4, 5, 9, 7, 3 };
        int[] result = countEvenOdd(arr);
        System.out.println("Even: " + result[0] + " Odd: " + result[1]);

    }
}
