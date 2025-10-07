class Vehicle {
    protected String brand;
    protected int year;
    protected double price;

    public Vehicle(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        System.out.println("Vehicle constructor called");
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Price: $" + price);
    }
}

class Car extends Vehicle {
    private int doors;
    private String fuelType;

    public Car(String brand, int year, double price, int doors, String fuelType) {
        // Using super to call parent constructor
        super(brand, year, price);
        this.doors = doors;
        this.fuelType = fuelType;
        System.out.println("Car constructor called");
    }

    @Override
    public void displayInfo() {
        // Using super to call parent method
        super.displayInfo();
        System.out.println("Doors: " + doors + ", Fuel Type: " + fuelType);
    }

    public void showParentFields() {
        // Using super to access parent fields
        System.out.println("Parent brand: " + super.brand);
        System.out.println("Parent year: " + super.year);
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;
    private int range;

    public ElectricCar(String brand, int year, double price, int doors, int batteryCapacity, int range) {
        // Chain of super calls
        super(brand, year, price, doors, "Electric");
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls Car's displayInfo()
        System.out.println("Battery: " + batteryCapacity + "kWh, Range: " + range + " miles");
    }
}

public class Super {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2023, 25000, 4, "Gasoline");
        myCar.displayInfo();
        myCar.showParentFields();

        System.out.println("\n--- Electric Car ---");
        ElectricCar myEV = new ElectricCar("Tesla", 2024, 45000, 4, 75, 300);
        myEV.displayInfo();
    }
}
