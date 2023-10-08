package test.by.bsuir.task7;

import main.by.bsuir.task7.Sorting;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortingTest {
    private static double[] randomArray;
    private static double[] sortedArray;
    private static double[] reversedArray;

    @BeforeAll
    public static void setUp() {
        randomArray = generateRandomArray();
        sortedArray = Arrays.copyOf(randomArray, randomArray.length);
        Arrays.sort(sortedArray);
        reversedArray = Arrays.copyOf(sortedArray, sortedArray.length);
        reverseArray(reversedArray);
    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> sortTest() {
        return Stream.of(
                Arguments.of(new double[]{}, new double[]{}),
                Arguments.of(new double[]{1.0}, new double[]{1.0}),
                Arguments.of(randomArray, sortedArray),
                Arguments.of(sortedArray, sortedArray),
                Arguments.of(reversedArray, sortedArray)
        );
    }

    private static double[] generateRandomArray() {
        double[] array = new double[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    private static void reverseArray(double[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            double temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }

    @ParameterizedTest
    @MethodSource
    public void sortTest(double[] array, double[] expected) {
        double[] actual = Arrays.copyOf(array, array.length);
        Sorting.sort(actual);
        assertArrayEquals(expected, actual);
    }
}