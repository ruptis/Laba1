package main.by.bsuir.task6;

public class CircularMatrix {
    private CircularMatrix() {
    }

    public static double[][] getMatrix(double[] sequence) {
        int length = sequence.length;
        double[][] matrix = new double[length][length];

        for (int i = 0; i < length; i++) {
            System.arraycopy(sequence, i, matrix[i], 0, length - i);
            System.arraycopy(sequence, 0, matrix[i], length - i, i);
        }

        return matrix;
    }
}
