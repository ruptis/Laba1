package main.by.bsuir.task2;

public class SpecificArea {
    private static final ComplexArea area = new ComplexArea(new RectangleArea[]{
            new RectangleArea(-4,0,4,5),
            new RectangleArea(-6,-3,6,0)
    });

    private SpecificArea() { }

    public static boolean isPointInside(double x, double y)
    {
        return area.isPointInside(x, y);
    }
}
