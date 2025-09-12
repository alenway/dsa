public class SearchElement {
    public static int search(int[] arr, int target) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be Null");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 3, 2, 4, 11, 6, 7, 9, 8, 2, 4, 5, 9, 7, 3 };
        int result = search(arr, 11);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Index number of an array: " + result);
        }
    }
}
