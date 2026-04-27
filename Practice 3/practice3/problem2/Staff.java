package practice3.problem2;

import java.util.Objects;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString()
                + ", school=" + school
                + ", pay=" + pay + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Staff)) return false;
        Staff other = (Staff) obj;
        return Double.compare(pay, other.pay) == 0
                && Objects.equals(school, other.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), school, pay);
    }
}
