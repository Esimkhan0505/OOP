package pr4.interfaces.sorting;

public class Student2 implements Comparable<Student2> {
    private String name;
    private double gpa;

    public Student2(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student2 other) {
        return Double.compare(this.gpa, other.gpa);
    }

    @Override
    public String toString() {
        return "Student2{name='" + name + "', gpa=" + gpa + "}";
    }
}