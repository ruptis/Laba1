package main.by.bsuir.task8;

import java.util.Arrays;

public class ArraysMerging {
    private ArraysMerging() {
    }

    public static int[] getInsertPositions(double[] source, double[] destination) {
        int[] insertPositions = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            int position = Arrays.binarySearch(destination, source[i]);
            insertPositions[i] = isFounded(position) ? nextPosition(position) : toInsertionPoint(position);
        }

        return insertPositions;
    }

    private static boolean isFounded(int position) {
        return position >= 0;
    }

    private static int nextPosition(int position) {
        return position + 1;
    }

    private static int toInsertionPoint(int position) {
        return -position - 1;
    }
}
