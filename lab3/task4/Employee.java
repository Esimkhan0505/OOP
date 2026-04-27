package lab3.task4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee() {
        super();
        this.salary = 0.0;
        this.hireDate = new Date();
        this.insuranceNumber = "Unknown";
    }

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public Employee(Employee other) {
        super(other);
        this.salary = other.salary;
        this.hireDate = new Date(other.hireDate.getTime());
        this.insuranceNumber = other.insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public Employee clone() {
        return new Employee(this);
    }

    @Override
    public String toString() {
        return "Employee[" + super.toString()
                + ", salary=" + salary
                + ", hireDate=" + hireDate
                + ", insuranceNumber=" + insuranceNumber + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        if (!super.equals(obj)) return false;
        Employee other = (Employee) obj;
        return Double.compare(salary, other.salary) == 0
                && Objects.equals(hireDate, other.hireDate)
                && Objects.equals(insuranceNumber, other.insuranceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, hireDate, insuranceNumber);
    }
}
