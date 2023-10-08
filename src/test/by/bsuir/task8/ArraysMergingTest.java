package test.by.bsuir.task8;

import main.by.bsuir.task8.ArraysMerging;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArraysMergingTest {
    @SuppressWarnings("unused")
    private static Stream<Arguments> getInsertPositionsTestEmptySource() {
        return Stream.of(
                Arguments.of(new double[]{}, new double[]{}),
                Arguments.of(new double[]{}, new double[]{1.0, 2.0, 3.0}),
                Arguments.of(new double[]{1.0, 2.0, 3.0}, new double[]{}),
                Arguments.of(new double[]{}, new double[]{1.0}),
                Arguments.of(new double[]{1.0}, new double[]{}),
                Arguments.of(new double[]{2.0, 3.0}, new double[]{1.0, 2.0, 3.0, 4.0}),
                Arguments.of(new double[]{1.0, 2.0, 3.0, 4.0}, new double[]{2.0, 3.0}),
                Arguments.of(new double[]{1.0, 2.0, 3.0}, new double[]{1.0, 2.0, 3.0}),
                Arguments.of(new double[]{4.0, 5.0, 6.0}, new double[]{1.0, 2.0, 3.0}),
                Arguments.of(new double[]{1.0, 2.0, 2.0, 3.0, 3.0, 3.0}, new double[]{1.0, 2.0, 3.0, 3.0, 3.0, 4.0})
        );
    }

    @ParameterizedTest
    @MethodSource
    public void getInsertPositionsTestEmptySource(double[] source, double[] destination) {
        int[] result = ArraysMerging.getInsertPositions(source, destination);
        double[] newSequence = getNewSequence(source, destination, result);
        assertTrue(isSequenceConsistsOf(newSequence, source, destination) && isIncreasingSequence(newSequence));
    }

    private double[] getNewSequence(double[] source, double[] destination, int[] insertPositions) {
        double[] newSequence = new double[source.length + destination.length];
        int sourceIndex = 0;
        int destinationIndex = 0;

        for (int i = 0; i < newSequence.length; i++) {
            if (sourceIndex < source.length && (destinationIndex >= destination.length || insertPositions[sourceIndex] <= destinationIndex)) {
                newSequence[i] = source[sourceIndex];
                sourceIndex++;
            } else {
                newSequence[i] = destination[destinationIndex];
                destinationIndex++;
            }
        }

        return newSequence;
    }

    private boolean isSequenceConsistsOf(double[] sequence, double[] array1, double[] array2) {
        int array1Index = 0;
        int array2Index = 0;

        for (double element : sequence) {
            if (array1Index < array1.length && element == array1[array1Index]) {
                array1Index++;
            } else if (array2Index < array2.length && element == array2[array2Index]) {
                array2Index++;
            } else {
                return false;
            }
        }

        return true;
    }

    private boolean isIncreasingSequence(double[] sequence) {
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] > sequence[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
