package lab2.problem1c;

import java.util.Objects;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        return year == other.year && Objects.equals(brand, other.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, year);
    }

    @Override
    public String toString() {
        return "Vehicle[brand=" + brand + ", year=" + year + "]";
    }
}
