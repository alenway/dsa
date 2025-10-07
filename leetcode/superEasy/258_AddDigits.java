class AddDigits {
    public static int add(int nums) {
        int temp = nums;
        int sum = 0;
        if (temp <= 9)
            return temp;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return add(sum);
    }

    public static void main(String[] args) {
        int nums = 38;
        System.out.println(add(nums));
        // int result = nums % 10;
        // System.out.println(result);
    }
}
