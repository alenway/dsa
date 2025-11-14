class Demo {
    public static void test() {
        System.out.println("from demo class test method.");
    }
}

class SubtractingEquals {
    public static void equals(int[] nums) {
        System.out.println("dummy");
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 0, 3, 5 };
        equals(nums);
        Demo.test();
    }
}
