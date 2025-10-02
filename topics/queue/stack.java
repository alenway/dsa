package topics.queue;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int[] nums = { 6, 5, 4, 3, 2, 1 };
        for (int num : nums) {
            stack1.push(num);
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        System.out.println(stack2);

    }
}
