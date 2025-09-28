public class staticSingleton {
    // Static variable to hold single instance
    private static DatabaseConnection instance;

    // Private constructor
    private DatabaseConnection() {}

    // Static method to get instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Instance method
    public void connect() {
        System.out.println("Connected to database");
    }
}

// Usage
DatabaseConnection db = DatabaseConnection.getInstance();
db.connect();
