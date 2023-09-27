package main.by.bsuir.task8;

import java.util.Arrays;

public class Main {
    private static final double[] SOURCE = {2, 3, 4, 0, 5, -53};
    private static final double[] DESTINATION = {1, 2, 5};

    public static void main(String[] args) {
        int[] result = ArraysMerging.getInsertPositions(SOURCE, DESTINATION);
        System.out.println("Insert positions:" + Arrays.toString(result));
    }
}
