import java.util.ArrayList;
import java.util.List;

class BankAccount {
    private double balance;
    private List<String> transectionHistory;

    // Lazy initilization in getter
    public List<String> getTransectionHistory() {
        if (transectionHistory == null) {
            transectionHistory = new ArrayList<>();
        }
        return new ArrayList<>(transectionHistory);
    }

    // controlled modification
    public void addTransections(String transection) {
        if (transectionHistory == null) {
            transectionHistory = new ArrayList<>();
        }
        transectionHistory.add(transection);
    }

    // computed property
    public boolean isOverdrawn() {
        return balance < 0;
    }
}

public class advanceGetterSetter {
    public static void main(String[] args) {

    }
}
