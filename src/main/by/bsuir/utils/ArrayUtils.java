package main.by.bsuir.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>(array.length);
        for (int i : array) {
            list.add(i);
        }
        return list;
    }
}
