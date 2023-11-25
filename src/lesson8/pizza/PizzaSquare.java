package pizza;



public class PizzaSquare {

    double diameter = 0;
    public double PizzaSq(double diameter) {
        double pizzaCal = 40;
        double pizzaSq = Math.PI * (diameter / 2) * (diameter / 2);
        double pizzaTot = pizzaSq * pizzaCal;
        return pizzaTot;

    }
}
