public class SingleNumber {
    public static int Find(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 3, 6, 5, 7 };
        System.out.println(Find(arr));
    }
}
