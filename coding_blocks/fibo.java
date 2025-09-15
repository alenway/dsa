public class fibo {
    static int count = 0;

    public static int getFiboRec(int value) {
        count++;
        if (value == 1) {
            return 0;
        }
        if (value == 2) {
            return 1;
        }
        return getFiboRec(value - 1) + getFiboRec(value - 2);
    }

    public static void main(String[] args) {
        int num = 60;
        System.out.println(getFiboRec(num));
        System.out.println("number of counts: " + count);
    }
}
