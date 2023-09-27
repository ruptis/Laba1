package main.by.bsuir.task6;

import java.util.Arrays;

public class Main {
    private static final double[] SEQUENCE = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        System.out.println("Initial sequence: " + Arrays.toString(SEQUENCE));
        double[][] matrix = CircularMatrix.getMatrix(SEQUENCE);

        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
