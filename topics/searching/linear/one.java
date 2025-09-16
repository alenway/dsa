class one {
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index : arr) {
            if (arr[index] == target) {
                return arr[index];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 34, 12, 29, 45, 37, 81, 33, 34 };
        int target = 34;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
}
