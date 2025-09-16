import java.util.Stack;
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int top = 6;
        boolean limit = true;
        while (limit) {
            System.out.print("Enter 1 for add, 2 for show , 3 for delete: ");
            int choise = scan.nextInt();
            switch (choise) {
                case 1:
                    if (top > 0) {
                        System.out.print("Enter value: ");
                        int value = scan.nextInt();
                        stack.push(value);
                        top--;
                        break;
                    } else {
                        System.out.println("Limit Exceded!!!");
                    }

                case 2:
                    System.out.println(stack);
                    break;
                case 3:
                    if (top == 6) {
                        System.out.println("Nothing to remove!!!");
                        break;
                    } else {
                        int remove = stack.pop();
                        System.out.println("Removed : " + remove);
                        top++;
                        break;
                    }
                default:
                    System.out.println("Enter value which are given in the list. idot.");
                    break;
            }
        }
        scan.close();
    }
}
