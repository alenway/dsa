import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] numbers = { 2, -1, 3, 5, 6, -4 };
        Arrays.sort(numbers, 0, 3); // sorts in ascending order

        System.out.println(Arrays.toString(numbers));
    }
}
