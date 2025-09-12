public class ArrayOrder {
    public static boolean order(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Null Values not Allowed.");
        }
        if (arr.length <= 1) {
            return true;
        }
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        boolean result = order(arr);
        System.out.println(result);
    }
}
