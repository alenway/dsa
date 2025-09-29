import java.util.Stack;

public class reverseArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int arr[] = { 2, 4, 6, 9 };
        for (int i = arr.length - 1; i >= 0; i--) {
            stack.push(arr[i]);
        }
        System.out.println(stack);
    }
}
