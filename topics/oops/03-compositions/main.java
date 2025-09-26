// Composition in Java = a design principle where a class contains objects of other classes as fields to achieve functionality.
// It models a “has-a” relationship.
class engine {

    void start() {
        System.out.println("engine starts.");
    }
}

class car {
    private engine engine;

    car() {
        engine = new engine();
    }

    void drive() {
        engine.start();
    }
}

public class main {
    public static void main(String[] args) {
        car c1 = new car();
        c1.drive();

    }
}
