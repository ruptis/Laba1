package main.by.bsuir.utils;

import java.util.List;
import java.util.function.Predicate;

public class ListUtils {
    private ListUtils() {
    }

    public static <T> int[] getIndexesOf(List<T> list, Predicate<? super T> predicate) {
        int[] indexes = new int[list.size()];
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (predicate.test(list.get(i))) {
                indexes[index++] = i;
            }
        }
        return ArrayUtils.trim(indexes, index);
    }
}
