public class Classes {
    // creating class Car
    class Car {
        String color;
        int speed;

        void display() {
            System.out.println("Car is driving at " + speed + " km/h.");
        }
    }

    public static void main(String[] args) {
        // Creating bojects;
        Car volvo = new Car();
        volvo.color = "Red";
        volvo.speed = 100;
        volvo.display();
    }
}
