package main.by.bsuir.task7;

import java.util.Arrays;

public class Main {
    private static final double[] ARRAY = {1.0, 2.0, 3.0, 4.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9};

    public static void main(String[] args) {
        System.out.println("Initial array: " + Arrays.toString(ARRAY));
        Sorting.sort(ARRAY);
        System.out.println("Sorted array: " + Arrays.toString(ARRAY));
    }
}
