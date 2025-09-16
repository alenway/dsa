class searchInRange {
    static int search(int[] arr, int[] range, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = range[0]; i <= range[1]; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };
        int[] range = { 1, 4 };
        int target = 14;
        System.out.println(search(arr, range, target));
    }
}
