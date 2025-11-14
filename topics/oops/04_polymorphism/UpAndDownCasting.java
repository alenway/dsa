class Animal {
        public void makeSound() {
                System.out.println("Animal makes a sound");
        }
}

class Dog extends Animal {
        @Override
        public void makeSound() {
                System.out.println("Dog barks");
        }
}

class Cat extends Animal {
        @Override
        public void makeSound() {
                System.out.println("Cat meows");
        }
}

public class UpAndDownCasting {
        public static void main(String[] args) {
                // Usage
                Animal myAnimal = new Dog();
                myAnimal.makeSound(); // Output: "Dog barks" - runtime decision

                // Animal animal = new Dog(); // Upcasting - always safe
                // animal.makeSound(); // Calls Dog's implementation

                Animal animal = new Dog();
                // Downcasting - requires explicit cast and can be risky
                if (animal instanceof Dog) {
                        Dog dog = (Dog) animal; // Downcasting
                        dog.makeSound();
                }
        }
}
