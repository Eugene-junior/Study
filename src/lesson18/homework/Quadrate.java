package homework;

import java.util.Random;

public class Quadrate extends Shape{
    private double Side;


    public Quadrate(String name, int side) {
        super(name);
        Side = side;
    }

    @Override
    public double CalculatorSquare() {
        return Side * Side;
    }

    @Override
    public double CalculatorPerimeter() {
        return Side * 4;
    }

    @Override
    public String toString() {
        return "Quadrate{" +
                "Side=" + Side +
                '}';
    }
}


