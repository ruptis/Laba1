package main.by.bsuir.task1;

public class Main {
    private static final double X = 1.0;
    private static final double Y = 2.0;

    public static void main(String[] args) {
        double result = ExpressionCalculator.calculateExpression(X, Y);
        System.out.printf("Expression result = %.3f", result);
    }
}
