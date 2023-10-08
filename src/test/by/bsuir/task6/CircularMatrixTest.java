package test.by.bsuir.task6;

import main.by.bsuir.task6.CircularMatrix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircularMatrixTest {

    @Test
    public void getMatrixTestEmptySequence() {
        double[] sequence = {};
        double[][] expected = {};

        double[][] result = CircularMatrix.getMatrix(sequence);

        assertArrayEquals(expected, result);
    }

    @Test
    public void getMatrixTestSingleElementSequence() {
        double[] sequence = {1.0};
        double[][] expected = {{1.0}};

        double[][] result = CircularMatrix.getMatrix(sequence);

        assertArrayEquals(expected, result);
    }

    @Test
    public void getMatrixTestMultipleElementSequence() {
        double[] sequence = {1.0, 2.0, 3.0, 4.0};
        double[][] expected = {
                {1.0, 2.0, 3.0, 4.0},
                {2.0, 3.0, 4.0, 1.0},
                {3.0, 4.0, 1.0, 2.0},
                {4.0, 1.0, 2.0, 3.0}
        };

        double[][] result = CircularMatrix.getMatrix(sequence);

        assertArrayEquals(expected, result);
    }

    @Test
    public void getMatrixTestLargeSequence() {
        double[] sequence = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        double[][] expected = {
                {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0},
                {2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 1.0},
                {3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 1.0, 2.0},
                {4.0, 5.0, 6.0, 7.0, 8.0, 1.0, 2.0, 3.0},
                {5.0, 6.0, 7.0, 8.0, 1.0, 2.0, 3.0, 4.0},
                {6.0, 7.0, 8.0, 1.0, 2.0, 3.0, 4.0, 5.0},
                {7.0, 8.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0},
                {8.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0}
        };

        double[][] result = CircularMatrix.getMatrix(sequence);

        assertArrayEquals(expected, result);
    }
}
