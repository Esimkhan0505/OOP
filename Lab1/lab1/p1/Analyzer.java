package lab1.p1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("Q")) break;

            try {
                double val = Double.parseDouble(input);
                data.add(val);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or Q.");
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMax());
    }
}
