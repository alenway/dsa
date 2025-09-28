class Car {
    private static int carCount = 0;
    private static String model;

    public Car(String model) {
        this.model = model;
        carCount++;
    }

    public static int getCarCount() {
        return carCount;
    }

    public void displayInfo() {
        System.out.println(model);
        System.out.println(Car.getCarCount());
    }
}

public class staticVariables {
    public static void main(String[] args) {
        Car c1 = new Car("Volvo");
        c1.displayInfo();

    }
}
