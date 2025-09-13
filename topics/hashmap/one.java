import java.util.HashMap;
import java.util.HashSet;

class one {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Narendra");
        map.put(2, "Ravi");
        map.put(3, "Shivam");
        map.put(4, "Riya");
        map.put(5, "Ankit");
        map.put(6, null);
        map.put(7, null);
        map.put(8, null);
        map.put(9, null);
        map.put(10, null);
        map.put(11, null);
        map.put(12, null);

        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicate = new HashSet<>();

        for (String value : map.values()) {
            if (!seen.add(value)) {
                duplicate.add(value);
            }
        }

    }
}
