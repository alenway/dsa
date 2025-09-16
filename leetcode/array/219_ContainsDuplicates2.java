import java.util.HashMap;

class ContainDuplicates2 {
    public static boolean find(int[] arr, int k) {
        // if(arr == null){
        // throw new IllegalArgumentException("Null Array.");
        // }
        // if(arr.length == 0){
        // return false;
        // }
        boolean flag = false;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 1; j < arr.length; j++) {
        // if (i == j) {
        // continue;
        // }
        // if (arr[i] == arr[j]) {
        // if (Math.abs(i - j) <= k) {
        // flag = true;
        // }
        // }
        // }
        // }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int previousIndex = map.get(arr[i]);
                if (Math.abs(i - previousIndex) <= k) {
                    flag = true;
                }
            }
            map.put(arr[i], i);
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3 };
        int k = 2;
        boolean result = find(arr, k);
        System.out.println(result);
    }
}
