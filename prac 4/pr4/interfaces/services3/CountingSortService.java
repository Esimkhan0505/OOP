package pr4.interfaces.services3;

public class CountingSortService {

    public static void countingSort(int[] arr) {
        int[] count = new int[11]; // indices 0..10

        for (int num : arr) {
            count[num]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}