package lab2.problem1a;

public class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public String toString() {
        return "Cube[side=" + side + "]";
    }
}
