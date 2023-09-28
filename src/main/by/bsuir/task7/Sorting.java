package main.by.bsuir.task7;

public class Sorting {
    private Sorting() {
    }

    public static void sort(double[] array) {
        int i = 0;
        while (i < array.length - 1) {
            i = sortStep(array, i);
        }
    }

    private static int sortStep(double[] array, int i) {
        if (array[i] > array[i + 1]) {
            swap(array, i, i + 1);
            if (i > 0) {
                i--;
            }
        } else {
            i++;
        }
        return i;
    }

    private static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
