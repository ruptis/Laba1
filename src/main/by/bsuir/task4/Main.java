package main.by.bsuir.task4;

import java.util.Arrays;

public class Main {
    private static final Integer[] ARRAY = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        System.out.println("Initial array: " + Arrays.toString(ARRAY));
        var result = PrimeArraySelector.getIndexesOfPrimes(ARRAY);
        if (result.length == 0) {
            System.out.println("No prime numbers found");
        } else {
            System.out.println("Prime numbers found at indexes:");
            for (int i : result) {
                System.out.println(i);
            }
        }
    }
}
