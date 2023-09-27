package main.by.bsuir.task4;

import main.by.bsuir.utils.ArrayUtils;
import main.by.bsuir.utils.ListUtils;

import java.util.List;

public class PrimeArrayFilter {
    private PrimeArrayFilter() {
    }

    public static int[] filter(int[] array) {
        List<Integer> list = ArrayUtils.toList(array);
        List<Integer> filtered = filter(list);
        return ListUtils.toArray(filtered);
    }

    public static List<Integer> filter(List<Integer> list) {
        return list.stream().filter(PrimeNumberChecker::isPrime).toList();
    }
}
