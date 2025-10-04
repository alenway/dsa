import java.util.HashSet;

class ContainDuplicats {
    public static boolean duplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 4 };
        System.out.println(duplicate(nums));
    }
}
