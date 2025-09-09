public class InsertPosition {
    public static int Search(int[] arr, int target) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            } else if (target > arr[i]) {
                a++;
            } else {
                continue;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 8 };
        int target = 3;
        int result = Search(arr, target);
        System.out.println(result);
    }
}
