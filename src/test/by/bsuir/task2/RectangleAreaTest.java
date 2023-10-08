package test.by.bsuir.task2;

import main.by.bsuir.task2.RectangleArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaTest {
    @Test
    public void isPointInsideTestInsideRectangle() {
        RectangleArea rectangle = new RectangleArea(1.0, 2.0, 5.0, 6.0);
        assertTrue(rectangle.isPointInside(3.0, 4.0));
    }

    @Test
    public void isPointInsideTestOnBoundary() {
        RectangleArea rectangle = new RectangleArea(1.0, 2.0, 5.0, 6.0);
        assertTrue(rectangle.isPointInside(1.0, 2.0));
        assertTrue(rectangle.isPointInside(5.0, 6.0));
        assertTrue(rectangle.isPointInside(1.0, 6.0));
        assertTrue(rectangle.isPointInside(5.0, 2.0));
    }

    @Test
    public void isPointInsideTestOutsideRectangle() {
        RectangleArea rectangle = new RectangleArea(1.0, 2.0, 5.0, 6.0);
        assertFalse(rectangle.isPointInside(0.0, 0.0));
    }

    @Test
    public void constructorTestWithInvalidArguments() {
        assertThrows(IllegalArgumentException.class, () -> new RectangleArea(5.0, 6.0, 1.0, 2.0));
        assertThrows(IllegalArgumentException.class, () -> new RectangleArea(1.0, 6.0, 5.0, 2.0));
    }

}