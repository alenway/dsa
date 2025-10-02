import java.util.List;
import java.util.ArrayList;

// Immutable Classes
// Definition: Classes whose instances cannot be modified after creation
public final class immutableClasses {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    public immutableClasses(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>(hobbies);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }

    public static void main(String[] args) {

    }
}
