class AddBinary {
    public static String convert(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0; // Fixed: changed i to j

            int total = digitA + digitB + carry;
            result.append(total % 2);
            carry = total / 2;

            i--;
            j--;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String result = convert(a, b);
        System.out.println(result); // Output: "100"

        // Test with more cases
        System.out.println(convert("1010", "1011")); // Output: "10101"
        System.out.println(convert("0", "0")); // Output: "0"
        System.out.println(convert("1", "111")); // Output: "1000"
    }
}
