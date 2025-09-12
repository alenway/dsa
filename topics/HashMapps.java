import java.util.HashMap;
import java.util.Map;

public class HashMapps {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();

        ageMap.put("John", 20);
        ageMap.put("Ravi", 21);
        ageMap.put("Nitin", 23);

        System.out.println(ageMap);

        Integer johnsAge = ageMap.get("John");
        System.out.println(johnsAge);

        boolean hasJohn = ageMap.containsKey("John");
        System.out.println(hasJohn);

        ageMap.remove("John");
        System.out.println(ageMap);

        HashMap<String, String> map = new HashMap<>();
        map.put("name", "John");
        map.put("name", "Alice");
    }
}
