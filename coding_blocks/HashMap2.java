import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();

        hmp.put(1, 22);
        hmp.put(2, 23);
        hmp.put(3, 24);

        hmp.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
}
