interface Vehicle {
    // Constant (implicitly public static final)
    int MAX_SPEED = 200;

    // Abstract methods (implicitly public abstract)
    void start();

    void stop();

    void accelerate(int speed);
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

    @Override
    public void accelerate(int speed) {
        System.out.println("Car accelerating to " + speed + " km/h");
    }
}

public class InterfaceClass {
    public static void main(String[] args) {

    }
}
