class Employee {
    // static variables
    private static int nextId = 1;
    private static String company = "Tech Corp";

    // instance variables
    private int id;
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.id = nextId++;
        this.name = name;
        this.position = position;
    }

    // Instance method accessing both static and instance members
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Position: " + position + ", Company: " + company);
    }

    // Static method
    public static void changeCompany(String newCompany) {
        company = newCompany;
    }

    // Static method cannot access instance members directly
    public static void printCompany() {
        System.out.println("Company: " + company);
        // System.out.println(name); // ERROR - cannot access instance variable
    }
}

public class mixed {

}
