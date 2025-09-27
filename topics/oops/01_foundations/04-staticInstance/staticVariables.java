public class Car {
    private static int carCount = 0;
    private String model;

    public Car(String model) {
        this.model = model;
        carCount++;
    }

    public static int getCarCount() {
        return carCount;
    }
}

public class staticVariables {
    public static void main(String[] args) {
        Car c1 = new Car("Volvo");
        System.out.println(Car.getCarCount());
    }
}
