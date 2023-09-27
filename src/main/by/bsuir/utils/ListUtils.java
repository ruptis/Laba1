package main.by.bsuir.utils;

import java.util.List;

public class ListUtils {
    private ListUtils() {
    }

    public static int[] toArray(List<Integer> list) {
        return list.stream().mapToInt(i -> i).toArray();
    }
}
