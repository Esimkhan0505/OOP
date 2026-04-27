package lab3.task4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate,
                   String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public Manager(Manager other) {
        super(other);
        this.bonus = other.bonus;
        this.team = new Vector<>();
        for (Employee employee : other.team) {
            this.team.add(employee.clone());
        }
    }

    public void addTeamMember(Employee employee) {
        team.add(employee);
    }

    public void removeTeamMember(Employee employee) {
        team.remove(employee);
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public int compareTo(Employee other) {
        int salaryComparison = Double.compare(this.getSalary(), other.getSalary());

        if (salaryComparison != 0) {
            return salaryComparison;
        }

        if (other instanceof Manager) {
            Manager otherManager = (Manager) other;
            return Double.compare(this.bonus, otherManager.bonus);
        }

        return salaryComparison;
    }

    @Override
    public Manager clone() {
        return new Manager(this);
    }

    @Override
    public String toString() {
        return "Manager[" + super.toString()
                + ", bonus=" + bonus
                + ", teamSize=" + team.size() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Manager)) return false;
        if (!super.equals(obj)) return false;
        Manager other = (Manager) obj;
        return Double.compare(bonus, other.bonus) == 0
                && Objects.equals(team, other.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team, bonus);
    }
}
