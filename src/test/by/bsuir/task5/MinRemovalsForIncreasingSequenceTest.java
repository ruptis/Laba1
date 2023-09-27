package test.by.bsuir.task5;

import main.by.bsuir.task5.MinRemovalsForIncreasingSequence;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinRemovalsForIncreasingSequenceTest {
    @ParameterizedTest
    @MethodSource
    public void getMinRemovalsTest(int[] array, int expected) {
        int actual = MinRemovalsForIncreasingSequence.getMinRemovals(array);
        assertEquals(expected, actual);
    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> getMinRemovalsTest() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 0),
                Arguments.of(new int[]{1, 2, 3, 4, 4, 5, 6, 7, 8, 9}, 1),
                Arguments.of(new int[]{1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 1, 2}, 3),
                Arguments.of(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, 8),
                Arguments.of(new int[]{4, 7, 13, 8, 2, 6, 2, 6, 5, 9, 34, 13, 56, 2, 0,
                        -1, 35, 355, 355, 454, 3434}, 12)
        );
    }
}