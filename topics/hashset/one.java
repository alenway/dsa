import java.util.HashSet;

class one {
    public static HashSet<Integer> sort(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int item : arr) {
            if (!seen.contains(item)) {
                seen.add(item);
            }
        }
        return seen;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 1, 5, 6, 7, 5, 4, 3 };
        HashSet<Integer> result = sort(arr);
        for (int item : result) {
            System.out.println(item);
        }
    }
}
