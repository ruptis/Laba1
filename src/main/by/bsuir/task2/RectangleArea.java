package main.by.bsuir.task2;

public class RectangleArea {
    private final double minX;
    private final double minY;
    private final double maxX;
    private final double maxY;

    public RectangleArea(double minX, double minY, double maxX, double maxY) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public boolean isPointInside(double x, double y) {
        return x >= minX && x <= maxX && y >= minY && y <= maxY;
    }
}
