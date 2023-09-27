package main.by.bsuir.task2;

public class RectangleArea {
    private final double minX;
    private final double minY;
    private final double maxX;
    private final double maxY;

    public RectangleArea(double minX, double minY, double maxX, double maxY) {
        validate(minX, minY, maxX, maxY);
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public boolean isPointInside(double x, double y) {
        return x >= minX && x <= maxX && y >= minY && y <= maxY;
    }

    private void validate(double minX, double minY, double maxX, double maxY) {
        if (minX > maxX) {
            throw new IllegalArgumentException("minX > maxX");
        }
        if (minY > maxY) {
            throw new IllegalArgumentException("minY > maxY");
        }
    }
}
