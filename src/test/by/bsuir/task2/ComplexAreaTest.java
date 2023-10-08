package test.by.bsuir.task2;

import main.by.bsuir.task2.ComplexArea;
import main.by.bsuir.task2.RectangleArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComplexAreaTest {

    @Test
    public void isPointInsideTestInsideOneRectangle() {
        RectangleArea[] areas = {new RectangleArea(1.0, 2.0, 5.0, 6.0)};
        ComplexArea complexArea = new ComplexArea(areas);
        assertTrue(complexArea.isPointInside(3.0, 4.0));
    }

    @Test
    public void isPointInsideTestInsideMultipleRectangles() {
        RectangleArea[] areas = {
                new RectangleArea(1.0, 2.0, 5.0, 6.0),
                new RectangleArea(6.0, 2.0, 10.0, 6.0)
        };
        ComplexArea complexArea = new ComplexArea(areas);
        assertTrue(complexArea.isPointInside(3.0, 4.0));
        assertTrue(complexArea.isPointInside(7.0, 4.0));
    }

    @Test
    public void isPointInsideTestOutsideAllRectangles() {
        RectangleArea[] areas = {
                new RectangleArea(1.0, 2.0, 5.0, 6.0),
                new RectangleArea(6.0, 2.0, 10.0, 6.0)
        };
        ComplexArea complexArea = new ComplexArea(areas);
        assertFalse(complexArea.isPointInside(0.0, 0.0));
        assertFalse(complexArea.isPointInside(11.0, 4.0));
    }

    @Test
    public void isPointInsideTestOnBoundary() {
        RectangleArea[] areas = {new RectangleArea(1.0, 2.0, 5.0, 6.0)};
        ComplexArea complexArea = new ComplexArea(areas);
        assertTrue(complexArea.isPointInside(1.0, 2.0));
    }

    @Test
    public void isPointInsideTestEmptyComplexArea() {
        RectangleArea[] areas = {};
        ComplexArea complexArea = new ComplexArea(areas);
        assertFalse(complexArea.isPointInside(3.0, 4.0));
    }
}
