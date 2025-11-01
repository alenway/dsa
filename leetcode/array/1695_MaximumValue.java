import java.util.HashSet;
import java.util.Set;

class MaximumValue{
      public static int max(int[] nums){
            int maxSum = 0;
        int currentSum = 0;
        int left = 0;
        Set<Integer> window = new HashSet<>();
        
        for (int right = 0; right < nums.length; right++) {
            // If duplicate found, shrink window from left
            while (window.contains(nums[right])) {
                window.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            
            // Add current element to window
            window.add(nums[right]);
            currentSum += nums[right];
            
            // Update max sum
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
      }
      public static void main(String[] args){
            int[] nums = {
                  187,470,25,436,538,809,441,167,477,110,275,133,666,345
                  ,411,459,490,266,987,965,429,166,809,340,467,318,125,165,
                  809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,
                  490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434
            };
            System.out.println(max(nums));
      }
}
