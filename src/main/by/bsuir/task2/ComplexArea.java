package main.by.bsuir.task2;

public class ComplexArea {
    private final RectangleArea[] areas;

    public ComplexArea(RectangleArea[] areas) {
        this.areas = areas;
    }

    public boolean isPointInside(double x, double y) {
        for (RectangleArea area : areas) {
            if (area.isPointInside(x, y)) {
                return true;
            }
        }
        return false;
    }
}
