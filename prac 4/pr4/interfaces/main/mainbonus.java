package pr4.interfaces.main;

import pr4.interfaces.services3.CountingSortService;

public class mainbonus {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 4, 0, 10, 3, 2, 7, 1};

        System.out.println("=== Bonus Task: Counting Sort ===");
        System.out.println("Original array:");
        CountingSortService.printArray(arr);

        CountingSortService.countingSort(arr);

        System.out.println("Sorted array:");
        CountingSortService.printArray(arr);
    }
}