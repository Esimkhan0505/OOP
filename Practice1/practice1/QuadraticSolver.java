package practice1;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Error: a cannot be 0 (not a quadratic equation).");
            return;
        }

        double D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println("Error: Discriminant is negative. No real roots.");
            return;
        }

        double sqrtD = Math.sqrt(D);
        double denom = 2 * a; // не считаем дважды

        double x1 = (-b + sqrtD) / denom;
        double x2 = (-b - sqrtD) / denom;

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
