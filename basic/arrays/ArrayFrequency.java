import java.util.HashMap;
import java.util.Map;

public class ArrayFrequency {
    public static HashMap<Integer, Integer> frequency(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 3, 2, 4, 11, 6, 7, 9, 8, 2, 4, 5, 9, 7, 3 };
        HashMap<Integer, Integer> frequencyMap = frequency(arr);
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Entry " + entry.getKey() + " : " + entry.getValue() + " times");
        }
    }
}
