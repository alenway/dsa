abstract class Animal {
    // Instance variable
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (no implementation)
    public abstract void makeSound();

    // Concrete method (with implementation)
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    // Regular instance method
    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

    }
}
