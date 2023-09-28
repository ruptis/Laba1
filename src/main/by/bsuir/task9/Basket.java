package main.by.bsuir.task9;

import java.awt.*;
import java.util.Arrays;

public class Basket {
    private final Ball[] balls;

    public Basket(Ball[] balls) {
        this.balls = balls;
    }

    public double getTotalWeight() {
        return Arrays.stream(balls)
                .mapToDouble(Ball::getWeight)
                .sum();
    }

    public long getBallsCountByColor(Color color) {
        return Arrays.stream(balls)
                .filter(ball -> ball.getColor().equals(color))
                .count();
    }
}
