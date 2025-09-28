final class StringUtils {
    // Private constructor to prevent instantiation
    private StringUtils() {}

    // Static utility methods
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
}

// Usage
if (!StringUtils.isNullOrEmpty(input)) {
    String reversed = StringUtils.reverse(input);
}
