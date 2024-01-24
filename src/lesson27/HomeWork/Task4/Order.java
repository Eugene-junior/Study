package HomeWork.Task4;

public class Order {

    private int id;
    private String dishName;
    private int numberOfDish;
    private double costOfDish;

    public Order(int id, String dishName, int numberOfDish, double costOfDish) {
        this.id = id;
        this.dishName = dishName;
        this.numberOfDish = numberOfDish;
        this.costOfDish = costOfDish;
    }

    public int getId() {
        return id;
    }

    public String getDishName() {
        return dishName;
    }

    public int getNumberOfDish() {
        return numberOfDish;
    }

    public double getCostOfDish() {
        return costOfDish;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dishName='" + dishName + '\'' +
                ", numberOfDish=" + numberOfDish +
                ", costOfDish=" + costOfDish +
                '}';
    }
}
