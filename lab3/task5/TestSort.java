package lab3.task5;

public class TestSort {
    public static void main(String[] args) {
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Mars", 45),
                new Chocolate("Snickers", 55)
        };

        Time[] times = {
                new Time(12, 30, 5),
                new Time(8, 15, 0),
                new Time(23, 59, 59)
        };

        Employee[] employees = {
                new Employee("Ali", 400000),
                new Employee("Dana", 600000),
                new Employee("Miras", 500000)
        };

        Sort.bubbleSort(chocolates);
        Sort.selectionSort(times);
        Sort.bubbleSort(employees);

        System.out.println("Sorted chocolates:");
        printArray(chocolates);

        System.out.println("\nSorted times:");
        printArray(times);

        System.out.println("\nSorted employees:");
        printArray(employees);
    }

    private static <E> void printArray(E[] array) {
        for (E item : array) {
            System.out.println(item);
        }
    }
}
