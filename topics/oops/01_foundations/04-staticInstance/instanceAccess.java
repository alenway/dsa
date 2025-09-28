class Solution {
    private int instanceVar = 5;

    public static void main(String[] args) {
        // Cannot access instance members directly
        // System.out.println(instanceVar); // ERROR

        // Must create an object first
        Solution obj = new Solution();
        System.out.println(obj.instanceVar); // OK
    }
}

public class instanceAccess {
    public static void main(String[] args) {

    }

}
