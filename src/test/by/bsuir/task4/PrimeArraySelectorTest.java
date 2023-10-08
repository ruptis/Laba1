package test.by.bsuir.task4;

import main.by.bsuir.task4.PrimeArraySelector;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PrimeArraySelectorTest {
    @ParameterizedTest
    @MethodSource
    public void getIndexesOfPrimesTestArray(Integer[] array, int[] expected) {
        int[] actual = PrimeArraySelector.getIndexesOfPrimes(array);
        assertArrayEquals(expected, actual);
    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> getIndexesOfPrimesTestArray() {
        return Stream.of(
                Arguments.of(new Integer[]{2, 4, 7, 11, 16, 17, 21}, new int[]{0, 2, 3, 5}),
                Arguments.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{1, 2, 4, 6}),
                Arguments.of(new Integer[]{4, 6, 8, 9, 15, 25}, new int[]{}),
                Arguments.of(new Integer[]{2, 3, 5, 7, 11}, new int[]{0, 1, 2, 3, 4}),
                Arguments.of(new Integer[]{}, new int[]{}),
                Arguments.of(new Integer[]{104729, 1299827, 15485867}, new int[]{0, 1, 2}),
                Arguments.of(new Integer[]{-2, -3, -5, -7}, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource
    public void getIndexesOfPrimesTestList(List<Integer> list, int[] expected) {
        int[] actual = PrimeArraySelector.getIndexesOfPrimes(list);
        assertArrayEquals(expected, actual);
    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> getIndexesOfPrimesTestList() {
        return Stream.of(
                Arguments.of(List.of(2, 4, 7, 11, 16, 17, 21), new int[]{0, 2, 3, 5}),
                Arguments.of(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), new int[]{1, 2, 4, 6}),
                Arguments.of(List.of(4, 6, 8, 9, 15, 25), new int[]{}),
                Arguments.of(List.of(2, 3, 5, 7, 11), new int[]{0, 1, 2, 3, 4}),
                Arguments.of(List.of(), new int[]{}),
                Arguments.of(List.of(104729, 1299827, 15485867), new int[]{0, 1, 2}),
                Arguments.of(List.of(-2, -3, -5, -7), new int[]{})
        );
    }
}