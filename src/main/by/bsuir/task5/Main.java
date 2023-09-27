package main.by.bsuir.task5;

import java.util.Arrays;

public class Main {
    private static final int[] ARRAY = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        System.out.println("Initial array: " + Arrays.toString(ARRAY));
        int result = MinRemovalsForIncreasingSequence.getMinRemovals(ARRAY);
        System.out.println("Min removals: " + result);
    }
}
