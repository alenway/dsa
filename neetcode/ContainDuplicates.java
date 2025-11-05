import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {

        public static boolean contain(int[] nums) {
                boolean flag = false;
                Set<Integer> map = new HashSet<>();
                for (int i = 0; i < nums.length; i++) {
                        if (map.contains(nums[i])) {
                                flag = true;
                                break;
                        }
                        map.add(nums[i]);
                }
                return flag;

        }

        public static void main(String[] args) {
                int[] nums = { 1, 2, 3, 4, 5, 6, 6 };
                System.out.println(contain(nums));
        }
}
