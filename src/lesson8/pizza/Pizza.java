package pizza;



public class Pizza {

    public static void main(String[] args) {


    PizzaSquare pizza = new PizzaSquare();

    double pizza24 = pizza.PizzaSq(24);
    double pizza28 = pizza.PizzaSq(28);

    System.out.println("Difference between pizzas are " + (pizza28/1000 - pizza24/1000) + " Kcalories");

    }







    }

