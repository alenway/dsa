class Student {
    private String name;
    private int age;
    private double gpa;

    // constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " Age: " + age + " Gpa: " + gpa);
    }
}

public class instanceVariables {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 14, 7);
        s1.displayInfo();
    }
}
