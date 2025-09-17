class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        int temp = x;
        int digit = 0;
        while (temp > 0) {
            digit *= 10;
            digit += temp % 10;
            temp = temp / 10;
        }
        System.out.println(digit);
    }
}
