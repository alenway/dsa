import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ImmutableStudent {
    private final String id;
    private final String name;
    private final Date enrollmentDate;
    private final List<Course> courses;
    private final Map<String, Double> grades;

    public ImmutableStudent(String id, String name, Date enrollmentDate,
            List<Course> courses, Map<String, Double> grades) {
        this.id = id;
        this.name = name;

        // Defensive copy for Date (mutable)
        this.enrollmentDate = new Date(enrollmentDate.getTime());

        // Defensive copies for collections
        this.courses = new ArrayList<>(courses);
        this.grades = new HashMap<>(grades);
    }

    // Getters with defensive copies
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getEnrollmentDate() {
        return new Date(enrollmentDate.getTime()); // Defensive copy
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses); // Defensive copy
    }

    public Map<String, Double> getGrades() {
        return new HashMap<>(grades); // Defensive copy
    }

    // Builder pattern for complex immutable objects
    public static class Builder {
        private String id;
        private String name;
        private Date enrollmentDate;
        private List<Course> courses = new ArrayList<>();
        private Map<String, Double> grades = new HashMap<>();

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEnrollmentDate(Date date) {
            this.enrollmentDate = new Date(date.getTime());
            return this;
        }

        public Builder addCourse(Course course) {
            this.courses.add(course);
            return this;
        }

        public Builder addGrade(String courseId, Double grade) {
            this.grades.put(courseId, grade);
            return this;
        }

        public ImmutableStudent build() {
            return new ImmutableStudent(id, name, enrollmentDate, courses, grades);
        }
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        // Using builder pattern for immutable object
        ImmutableStudent student = new ImmutableStudent.Builder()
                .setId("S123")
                .setName("John Doe")
                .setEnrollmentDate(new Date())
                .addCourse(new Course("CS101"))
                .addGrade("CS101", 95.5)
                .build();

        // This student object cannot be modified - thread-safe and predictable
    }
}
