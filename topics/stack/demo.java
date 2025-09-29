import java.util.Stack;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to add || 2 to remove || 3 to show || 4 to exit");
            int value = scan.nextInt();

            switch (value) {
                case 1:
                    System.out.print("enter value: ");
                    int count = scan.nextInt();
                    stack.push(count);
                    break;

                case 3:
                    System.out.println(stack);
                    break;
                default:
                    break;
            }
        }
    }
}
