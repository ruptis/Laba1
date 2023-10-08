package test.by.bsuir.task2;

import main.by.bsuir.task2.SpecificArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpecificAreaTest {

    @Test
    public void isPointInsideTestInsideArea() {
        assertTrue(SpecificArea.isPointInside(0.0, 2.0));
        assertTrue(SpecificArea.isPointInside(-3.0, -1.0));
    }

    @Test
    public void isPointInsideTestOnBoundary() {
        assertTrue(SpecificArea.isPointInside(4.0, 5.0));
        assertTrue(SpecificArea.isPointInside(-4.0, 0.0));
    }

    @Test
    public void isPointInsideTestOutsideArea() {
        assertFalse(SpecificArea.isPointInside(0.0, 6.0));
        assertFalse(SpecificArea.isPointInside(0.0, -4.0));
        assertFalse(SpecificArea.isPointInside(7.0, 0.0));
        assertFalse(SpecificArea.isPointInside(0.0, -5.0));
    }
}