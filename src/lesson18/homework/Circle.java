package homework;

public class Circle extends Shape{

    private double Radius;

    public Circle(String name, int Radius) {
        super(name);
        this.Radius = Radius;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double CalculatorSquare() {
        return Math.PI * Radius * Radius;
    }

    @Override
    public double CalculatorPerimeter() {
        return 2 * Math.PI * Radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                '}';
    }
}
