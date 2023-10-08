package main.by.bsuir.utils;

import java.util.function.Predicate;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> int[] getIndexesOf(T[] array, Predicate<? super T> predicate) {
        int[] indexes = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (predicate.test(array[i])) {
                indexes[index++] = i;
            }
        }
        return trim(indexes, index);
    }

    public static int[] trim(int[] indexes, int index) {
        int[] result = new int[index];
        System.arraycopy(indexes, 0, result, 0, index);
        return result;
    }
}
