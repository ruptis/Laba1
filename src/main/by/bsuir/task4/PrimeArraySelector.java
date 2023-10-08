package main.by.bsuir.task4;

import main.by.bsuir.utils.ArrayUtils;
import main.by.bsuir.utils.ListUtils;

import java.util.List;

public class PrimeArraySelector {
    private PrimeArraySelector() {
    }

    public static int[] getIndexesOfPrimes(Integer[] array) {
        return ArrayUtils.getIndexesOf(array, PrimeNumberChecker::isPrime);
    }

    public static int[] getIndexesOfPrimes(List<Integer> list) {
        return ListUtils.getIndexesOf(list, PrimeNumberChecker::isPrime);
    }
}
