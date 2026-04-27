package practice3.problem2;

import java.util.Objects;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString()
                + ", program=" + program
                + ", year=" + year
                + ", fee=" + fee + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return year == other.year
                && Double.compare(fee, other.fee) == 0
                && Objects.equals(program, other.program);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), program, year, fee);
    }
}
