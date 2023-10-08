package test.by.bsuir.task9;

import main.by.bsuir.task9.Ball;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BallTest {
    @Test
    public void getColorTest() {
        Ball ball = new Ball(Color.RED, 0.5);

        Color color = ball.getColor();

        assertEquals(Color.RED, color);
    }

    @Test
    public void setColorTest() {
        Ball ball = new Ball(Color.GREEN, 0.7);

        ball.setColor(Color.BLUE);

        assertEquals(Color.BLUE, ball.getColor());
    }

    @Test
    public void getWeightTest() {
        double expectedWeight = 1.0;
        Ball ball = new Ball(Color.YELLOW, expectedWeight);

        double weight = ball.getWeight();
        assertEquals(expectedWeight, weight, 0.001);
    }

    @Test
    public void setWeightTest() {
        Ball ball = new Ball(Color.BLUE, 0.8);

        double expectedWeight = 1.2;
        ball.setWeight(expectedWeight);

        double weight = ball.getWeight();
        assertEquals(expectedWeight, weight, 0.001);
    }
}