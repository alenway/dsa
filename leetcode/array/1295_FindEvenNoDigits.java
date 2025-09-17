class FindEvenNoDigits {
    public static int findNumber(int[] nums) {
        int maxValue = 0;
        for (int num : nums) {
            int temp = num;
            int count = 0;
            while (temp > 0) {
                int digit = temp % 10;
                temp = temp / 10;
                count++;
            }
            if (count % 2 == 0) {
                maxValue++;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896 };
        int result = findNumber(arr);
        System.out.println(result);
    }
}
