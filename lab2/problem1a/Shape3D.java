package lab2.problem1a;

public abstract class Shape3D {
    public abstract double volume();
    public abstract double surfaceArea();

    public void printInfo() {
        System.out.println(toString());
        System.out.printf("Volume: %.2f%n", volume());
        System.out.printf("Surface area: %.2f%n", surfaceArea());
    }
}
