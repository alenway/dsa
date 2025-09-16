class one {
    static int binarySearch(int[] arr, int target) {
        if (arr == null) {
            throw new IllegalArgumentException("Array can not be null.");
        }
        if (arr.length == 0) {
            return 0;
        }
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 9, 10, 12, 13, 15, 17, 18, 19, 21, 23, 24 };
        int target = 19;
        System.out.println(binarySearch(arr, target));
    }
}
