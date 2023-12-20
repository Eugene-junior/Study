package homework;

public class Triangle extends Shape{
    private double SideA;
    private double SideB;
    private  double SideC;
    private double Height;

    public Triangle(String name, int sideA, int sideB, int sideC, int height) {
        super(name);
        SideA = sideA;
        SideB = sideB;
        SideC = sideC;
        Height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "SideA=" + SideA +
                ", SideB=" + SideB +
                ", SideC=" + SideC +
                ", Height=" + Height +
                '}';
    }

    @Override
    public double CalculatorSquare() {
        return (SideA * SideB) / 2;
    }

    @Override
    public double CalculatorPerimeter() {
        return SideA + SideB + SideC;
    }
}

