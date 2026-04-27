package lab2.problem1c;

import java.util.Objects;

public class Car extends Vehicle {
    private String plateNumber;

    public Car(String brand, int year, String plateNumber) {
        super(brand, year);
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;
        if (!super.equals(obj)) return false;
        Car other = (Car) obj;
        return Objects.equals(plateNumber, other.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plateNumber);
    }

    @Override
    public String toString() {
        return "Car[" + super.toString() + ", plateNumber=" + plateNumber + "]";
    }
}
