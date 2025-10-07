class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + ", gpa=" + gpa + "}";
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {
        // Check if same object reference
        if (this == obj)
            return true;

        // Check if null or different class
        if (obj == null || getClass() != obj.getClass())
            return false;

        // Cast and compare fields
        Student student = (Student) obj;
        return id == student.id &&
                Double.compare(student.gpa, gpa) == 0 &&
                name.equals(student.name);
    }

    // Overriding hashCode() method
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id;
        result = 31 * result + Double.hashCode(gpa);
        return result;
    }
}

class Course {
    private String courseName;
    private String instructor;

    public Course(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + " (Instructor: " + instructor + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Course course = (Course) obj;
        return courseName.equals(course.courseName) &&
                instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        int result = courseName.hashCode();
        result = 31 * result + instructor.hashCode();
        return result;
    }
}

public class ClassMethods {
    public static void main(String[] args) {
        // toString() demonstration
        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.6);
        Course course = new Course("Java Programming", "Dr. Smith");

        System.out.println("=== toString() Examples ===");
        System.out.println(student1.toString());
        System.out.println(student2); // toString() called automatically
        System.out.println(course);

        // equals() demonstration
        System.out.println("\n=== equals() Examples ===");
        Student student3 = new Student("Alice", 101, 3.8);
        Student student4 = new Student("Alice", 101, 3.8);

        System.out.println("student1 == student3: " + (student1 == student3)); // false
        System.out.println("student1.equals(student3): " + student1.equals(student3)); // true
        System.out.println("student1.equals(student4): " + student1.equals(student4)); // true
        System.out.println("student1.equals(student2): " + student1.equals(student2)); // false

        // hashCode() demonstration
        System.out.println("\n=== hashCode() Examples ===");
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());
        System.out.println("student2 hashCode: " + student2.hashCode());

        // Using in collections
        java.util.HashSet<Student> studentSet = new java.util.HashSet<>();
        studentSet.add(student1);
        studentSet.add(student3); // Won't add duplicate due to equals() and hashCode()
        studentSet.add(student2);

        System.out.println("Students in set: " + studentSet.size()); // Should be 2
    }
}
