package lab1.p4;

import java.util.Arrays;

public class Course {
    private final String name;
    private final String description;
    private final int credits;
    private final String[] prerequisites;

    public Course(String name, String description, int credits, String... prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "Course{name='" + name + "', credits=" + credits +
                ", prereq=" + Arrays.toString(prerequisites) + "}";
    }
}
