import java.util.ArrayList;
import java.util.List;

public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    // Constructor initializes all fields
    public ImmutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        // Defensive copy for mutable objects
        this.hobbies = new ArrayList<>(hobbies);
    }

    // Getters only - no setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Return defensive copy for mutable objects
    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }

    // "Modification" returns new instance
    public ImmutablePerson withAge(int newAge) {
        return new ImmutablePerson(this.name, newAge, this.hobbies);
    }
}
