import java.util.Stack;

class validParanthesis {
    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' && stack.peek() == '{' || c == ')' && stack.peek() == '('
                    || c == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String pair = "{([])}";
        System.out.println(check(pair));
    }
}
