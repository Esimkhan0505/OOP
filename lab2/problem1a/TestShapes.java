package lab2.problem1a;

public class TestShapes {
    public static void main(String[] args) {
        Shape3D[] shapes = {
                new Cylinder(2, 5),
                new Sphere(3),
                new Cube(4)
        };

        for (Shape3D shape : shapes) {
            shape.printInfo();
            System.out.println();
        }
    }
}
