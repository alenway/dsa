public class objectCreation {
    // 1. Class Loading
    static {
        System.out.println("Class loaded into memory");
    }

    // 2. Memory Allocation
    private String data;

    // 3. Default Initialization (primitive: 0, boolean: false, reference: null)
    private int count; // initialized to 0

    // 4. Explicit Initialization
    {
        System.out.println("Instance initialization block executed");
        data = "default";
    }

    // 5. Constructor Execution
    public objectCreation(String data) {
        this.data = data;
        System.out.println("Constructor executed");
    }

    // 6. Object Usage
    public void process() {
        System.out.println("Processing: " + data);
    }

    // 7. Finalization (deprecated but part of lifecycle)
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalizing object: " + data);
            // Cleanup resources
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {

    }
}
