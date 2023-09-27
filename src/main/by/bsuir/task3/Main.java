package main.by.bsuir.task3;

import java.util.Map;

public class Main {
    private static final double LEFT = -1.0;
    private static final double RIGHT = 1.0;
    private static final double STEP = 0.1;

    public static void main(String[] args) {
        Map<Double, Double> result = TangentSolver.solve(LEFT, RIGHT, STEP);
        for (Map.Entry<Double, Double> entry : result.entrySet()) {
            System.out.printf("x = %.2f, f(x) = %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
