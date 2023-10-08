package test.by.bsuir.task1;

import main.by.bsuir.task1.ExpressionCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ExpressionCalculatorTest {
    @SuppressWarnings("unused")
    private static Stream<Arguments> calculateExpressionTest() {
        return Stream.of(
                Arguments.of(1.0, 2.0, 1.392274945),
                Arguments.of(0.0, 0.0, 0.5),
                Arguments.of(0.0, 1.0, 0.854036709),
                Arguments.of(1.0, 0.0, 1.569357806),
                Arguments.of(1.0, 1.0, 1.913410905),
                Arguments.of(1.0, -1.0, 1.50)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void calculateExpressionTest(double x, double y, double expected) {
        double actual = ExpressionCalculator.calculateExpression(x, y);
        Assertions.assertEquals(expected, actual, 0.0001);
    }
}