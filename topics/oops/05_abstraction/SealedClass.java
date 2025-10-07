// Define which classes can extend Animal
sealed abstract class Animal permits Dog, Cat, Bird {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}

// Subclasses must be final, sealed, or non-sealed
final class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

non-sealed class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

sealed class Bird extends Animal permits Parrot, Eagle {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
}

final class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }
}

final class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }
}

public class SealedClass {
    public static void main(String[] args) {

    }
}
