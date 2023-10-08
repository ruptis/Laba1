package main.by.bsuir.task9;

import java.awt.*;

public class Main {
    private static final Ball[] BALLS = new Ball[]{
            new Ball(Color.RED, 1.0),
            new Ball(Color.BLUE, 2.0),
            new Ball(Color.GREEN, 3.0),
            new Ball(Color.BLUE, 4.0),
            new Ball(Color.RED, 5.0),
            new Ball(Color.BLUE, 6.0),
    };

    public static void main(String[] args) {
        Basket basket = new Basket(BALLS);
        System.out.println("Total weight: " + basket.getTotalWeight());
        System.out.println("Blue balls count: " + basket.getBallsCountByColor(Color.BLUE));
    }
}
