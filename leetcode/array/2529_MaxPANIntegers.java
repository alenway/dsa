class MaxPANIntegers {
    public static int countInt(int[] arr) {
        int positive = 0, negative = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > 0) {
        // positive++;
        // } else if (arr[i] < 0) {
        // negative++;
        // } else {
        // continue;
        // }
        // }
        // if (positive > negative) {
        // return positive;
        // } else {
        // return negative;
        // }
        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }
        return Math.max(positive, negative);
    }

    public static void main(String[] args) {
        int[] arr = { -2, -1, -1, 1, 2, 3 };
        int result = countInt(arr);
        System.out.println(result);
    }
}
