package test.by.bsuir.task3;

import main.by.bsuir.task3.TangentSolver;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TangentSolverTest {

    @Test
    public void solveTestValidInput() {
        double left = 0.0;
        double right = Math.PI / 2;
        double step = 0.1;

        Map<Double, Double> result = TangentSolver.solve(left, right, step);

        assertNotNull(result);

        for (double x = left; x <= right; x += step) {
            assertTrue(result.containsKey(x));
        }

        for (double x = left; x <= right; x += step) {
            double expected = Math.tan(x);
            double actual = result.get(x);
            assertEquals(expected, actual, 0.01);
        }
    }

    @Test
    public void solveTestInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> TangentSolver.solve(1.0, 0.0, 0.1));

        assertThrows(IllegalArgumentException.class, () -> TangentSolver.solve(0.0, Math.PI / 2, -0.1));
    }
}