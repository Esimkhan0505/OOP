package practice3.problem2;

import java.util.Scanner;

public class Main {
    private static PersonRegistry registry = new PersonRegistry();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addSampleData();

        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Choose option: ");

            switch (choice) {
                case 1:
                    registry.printAllPeople();
                    break;
                case 2:
                    addNewPerson();
                    break;
                case 3:
                    addNewStudent();
                    break;
                case 4:
                    addNewStaff();
                    break;
                case 0:
                    running = false;
                    System.out.println("Program finished.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

            System.out.println();
        }
    }

    private static void addSampleData() {
        registry.addPerson(new Person("John", "Almaty"));
        registry.addPerson(new Student("Alice", "Astana", "Computer Science", 2, 15000));
        registry.addPerson(new Staff("Bob", "Shymkent", "KBTU", 300000));
    }

    private static void printMenu() {
        System.out.println("===== Person Registry Menu =====");
        System.out.println("1. Print all people");
        System.out.println("2. Add new Person");
        System.out.println("3. Add new Student");
        System.out.println("4. Add new Staff");
        System.out.println("0. Exit");
    }

    private static void addNewPerson() {
        String name = readString("Name: ");
        String address = readString("Address: ");

        registry.addPerson(new Person(name, address));
        System.out.println("Person added.");
    }

    private static void addNewStudent() {
        String name = readString("Name: ");
        String address = readString("Address: ");
        String program = readString("Program: ");
        int year = readInt("Year: ");
        double fee = readDouble("Fee: ");

        registry.addPerson(new Student(name, address, program, year, fee));
        System.out.println("Student added.");
    }

    private static void addNewStaff() {
        String name = readString("Name: ");
        String address = readString("Address: ");
        String school = readString("School: ");
        double pay = readDouble("Pay: ");

        registry.addPerson(new Staff(name, address, school, pay));
        System.out.println("Staff added.");
    }

    private static String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    private static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                int value = Integer.parseInt(scanner.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer number.");
            }
        }
    }

    private static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                double value = Double.parseDouble(scanner.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
