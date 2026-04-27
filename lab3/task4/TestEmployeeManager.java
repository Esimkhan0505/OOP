package lab3.task4;

import java.util.Arrays;
import java.util.Date;

public class TestEmployeeManager {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aruzhan", 500000, new Date(122, 5, 10), "IN001");
        Employee emp2 = new Employee("Dias", 450000, new Date(123, 2, 15), "IN002");
        Manager manager1 = new Manager("Miras", 800000, new Date(121, 1, 20), "IN003", 100000);
        Manager manager2 = new Manager("Dana", 800000, new Date(120, 8, 5), "IN004", 150000);

        manager1.addTeamMember(emp1);
        manager1.addTeamMember(emp2);

        Employee[] employees = { emp1, emp2, manager1, manager2 };

        System.out.println("Original:");
        printArray(employees);

        Arrays.sort(employees);
        System.out.println("\nSorted by Comparable salary, and bonus for managers if salary equal:");
        printArray(employees);

        Arrays.sort(employees, new NameComparator());
        System.out.println("\nSorted by name:");
        printArray(employees);

        Arrays.sort(employees, new HireDateComparator());
        System.out.println("\nSorted by hire date:");
        printArray(employees);

        Manager clonedManager = manager1.clone();
        System.out.println("\nCloned manager:");
        System.out.println(clonedManager);
    }

    private static void printArray(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
