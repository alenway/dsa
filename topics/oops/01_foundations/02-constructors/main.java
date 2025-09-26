class Student {
    // default constructor
    String name;
    int rollno;
    int marks;

}

class Book {
    // No argument constructor
    String title;

    Book() {
        title = "Untitled";
    }
}

class Employee {
    // Perameter constructor
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Employee: " + name + " (" + id + ")");
    }
}

class Students {
    // constructor overloading
    String name;
    int age;

    Students() {
        name = "Unknown";
        age = 0;
    }

    Students(String n) {
        name = n;
        age = 18; // default age
    }

    Students(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " (" + age + ")");
    }
}

public class main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Narendra";
        s1.rollno = 22930;
        s1.marks = 90;
        System.out.println(s1.name);
    }
}
