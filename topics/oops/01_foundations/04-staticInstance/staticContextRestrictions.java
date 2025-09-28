class Example {
    private int instanceVar = 10;
    private static int staticVar = 20;

    public void instanceMethod() {
        // Can access both static and instance members
        System.out.println(instanceVar); // OK
        System.out.println(staticVar); // OK
    }

    public static void staticMethod() {
        // Can only access static members directly
        System.out.println(staticVar); // OK
        // System.out.println(instanceVar); // ERROR
        // instanceMethod(); // ERROR
    }
}

public class staticContextRestrictions {
    public static void main(String[] args) {

    }
}
