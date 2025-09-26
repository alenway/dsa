// proper way to create a class
class vehicle{
    String name;
    void show(){
        System.out.println("this is vehicle class " + name );
    }
}
// file name and main class
public class Classes {
    // creating class Car with static
    static class Car extends vehicle{
        String color;
        int speed;

        void display() {
            System.out.println("Car is driving at " + speed + " km/h.");
        }
    }

    // creating class inside a main class without static
    class tata{
        String name;
        void moveTata(){
            System.out.println("tata moves; " + name);
        }
    }

    public static void main(String[] args) {
        // Creating bojects;
        Car volvo = new Car();
        volvo.color = "Red";
        volvo.speed = 100;
        volvo.display();
        vehicle v1 = new vehicle();
        v1.name = "vehicle one";
        v1.show();
        volvo.show();

        Classes outer = new Classes();
        tata t = outer.new tata();
        t.name = "Safari";
        t.moveTata();
    }
}
