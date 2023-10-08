package test.by.bsuir.task9;

import main.by.bsuir.task9.Ball;
import main.by.bsuir.task9.Basket;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasketTest {
    @Test
    public void getTotalWeightTest() {
        double[] ballsWeights = {0.5, 0.7, 0.8, 0.6};
        Ball[] balls = {
                new Ball(Color.RED, ballsWeights[0]),
                new Ball(Color.GREEN, ballsWeights[1]),
                new Ball(Color.BLUE, ballsWeights[2]),
                new Ball(Color.YELLOW, ballsWeights[3])
        };
        Basket basket = new Basket(balls);

        double expectedTotalWeight = Arrays.stream(ballsWeights).sum();
        double totalWeight = basket.getTotalWeight();

        assertEquals(expectedTotalWeight, totalWeight, 0.001);
    }

    @Test
    public void getBallsCountByColorTest() {
        Ball[] redBalls = {
                new Ball(Color.RED, 0.5),
                new Ball(Color.RED, 0.7),
                new Ball(Color.RED, 0.8),
                new Ball(Color.RED, 0.6)
        };
        Ball[] greenBalls = {
                new Ball(Color.GREEN, 0.5),
                new Ball(Color.GREEN, 0.7),
                new Ball(Color.GREEN, 0.8),
                new Ball(Color.GREEN, 0.6)
        };
        Ball[] blueBalls = {
                new Ball(Color.BLUE, 0.5),
                new Ball(Color.BLUE, 0.7),
                new Ball(Color.BLUE, 0.8),
                new Ball(Color.BLUE, 0.6)
        };

        Ball[] balls = mergeArrays(redBalls, greenBalls, blueBalls);
        Basket basket = new Basket(balls);

        long expectedRedBallsCount = redBalls.length;
        long expectedGreenBallsCount = greenBalls.length;
        long expectedBlueBallsCount = blueBalls.length;

        long redBallsCount = basket.getBallsCountByColor(Color.RED);
        long greenBallsCount = basket.getBallsCountByColor(Color.GREEN);
        long blueBallsCount = basket.getBallsCountByColor(Color.BLUE);

        assertEquals(expectedRedBallsCount, redBallsCount);
        assertEquals(expectedGreenBallsCount, greenBallsCount);
        assertEquals(expectedBlueBallsCount, blueBallsCount);
    }

    private static Ball[] mergeArrays(Ball[] redBalls, Ball[] greenBalls, Ball[] blueBalls) {
        Ball[] balls = new Ball[redBalls.length + greenBalls.length + blueBalls.length];
        System.arraycopy(redBalls, 0, balls, 0, redBalls.length);
        System.arraycopy(greenBalls, 0, balls, redBalls.length, greenBalls.length);
        System.arraycopy(blueBalls, 0, balls, redBalls.length + greenBalls.length, blueBalls.length);
        return balls;
    }
}