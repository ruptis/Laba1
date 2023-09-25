package main.by.bsuir.task2;

public class Main {
    private static final double X = 1.0;
    private static final double Y = 2.0;

    public static void main(String[] args) {
        boolean result = SpecificArea.isPointInside(X, Y);
        System.out.printf("Is point (%.3f, %.3f) inside the area? %b", X, Y, result);
    }
}
