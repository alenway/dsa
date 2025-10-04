class Animal {
    String name;
    String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println("make this sound while sleeping " + sound);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, String sound, String breed) {
        super(name, sound);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}

class Cat extends Animal {
    boolean hasClaws;

    public Cat(String name, String sound, boolean hasClaws) {
        super(name, sound);
        this.hasClaws = hasClaws;
    }

    public void meow() {
        System.out.println(name + " says meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "boww", "Golden Retriever");
        Cat myCat = new Cat("Whiskers", "meow", true);

        // Inherited methods
        myDog.eat(); // From Animal class
        myDog.sleep(); // From Animal class
        myDog.bark(); // From Dog class

        myCat.eat(); // From Animal class
        myCat.meow(); // From Cat class
    }
}
