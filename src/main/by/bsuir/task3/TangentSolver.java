package main.by.bsuir.task3;

import java.util.LinkedHashMap;
import java.util.Map;

public class TangentSolver {
    private TangentSolver() {
    }

    public static Map<Double, Double> solve(double left, double right, double step) {
        validate(left, right, step);
        Map<Double, Double> result = new LinkedHashMap<>();
        for (double x = left; x <= right; x += step) {
            result.put(x, Math.tan(x));
        }
        return result;
    }

    private static void validate(double left, double right, double step) {
        if (left > right) {
            throw new IllegalArgumentException("left > right");
        }
        if (step <= 0) {
            throw new IllegalArgumentException("step <= 0");
        }
    }
}
