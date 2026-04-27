package lab3.task5;

@SuppressWarnings("unchecked")
public class Sort {
    public static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] array) {
        boolean swapped = true;

        for (int pass = 0; pass < array.length - 1 && swapped; pass++) {
            swapped = false;

            for (int i = 0; i < array.length - 1 - pass; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
        }
    }

    public static <E extends Comparable<E>> void selectionSort(E[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }
}
