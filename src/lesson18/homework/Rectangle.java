package homework;

public class Rectangle extends Shape {


    private int SideA;
    private int SideB;


    public Rectangle(String name, int sideA, int sideB) {
        super(name);
        SideA = sideA;
        SideB = sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "SideA=" + SideA +
                ", SideB=" + SideB +
                '}';
    }

    @Override
    public double CalculatorSquare() {
        return SideB * SideA;
    }

    @Override
    public double CalculatorPerimeter() {
        return (SideA + SideB) * 2;
    }


}
