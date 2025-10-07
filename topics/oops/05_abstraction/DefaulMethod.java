interface Vehicle {
    void start();

    void stop();

    // Default method - provides implementation
    default void honk() {
        System.out.println("Beep beep!");
    }

    // Another default method
    default void service() {
        System.out.println("Performing routine maintenance");
        checkEngine();
        privateMethod(); // Can call private methods
    }

    void privateMethod();

    void checkEngine();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    // Optional: Can override default method
    @Override
    public void honk() {
        System.out.println("Car horn: Honk honk!");
    }
}

public class DefaulMethod {

    public static void main(String[] args) {

    }
}
