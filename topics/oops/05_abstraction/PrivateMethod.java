interface DatabaseOperations {
    default void connectAndQuery() {
        establishConnection();
        executeQuery();
        closeConnection();
    }

    default void connectAndUpdate() {
        establishConnection();
        executeUpdate();
        closeConnection();
    }

    // Private method - reduces code duplication
    private void establishConnection() {
        System.out.println("Establishing database connection...");
        // Connection logic
    }

    private void executeQuery() {
        System.out.println("Executing query...");
        // Query logic
    }

    private void executeUpdate() {
        System.out.println("Executing update...");
        // Update logic
    }

    private void closeConnection() {
        System.out.println("Closing database connection...");
        // Close logic
    }
}

public class PrivateMethod {
    public static void main(String[] args) {

    }
}
