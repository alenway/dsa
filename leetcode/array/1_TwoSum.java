import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static int[] sum(int[] arr, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two sum solution.");
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = sum(arr, target);
        System.out.println(Arrays.toString(result));

    }
}
