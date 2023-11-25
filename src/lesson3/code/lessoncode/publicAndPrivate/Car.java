package publicAndPrivate;

public class Car {

private String color;
private String model;
private String producer;

    public Car(String color, String model, String producer) {
        this.color = color;
        this.model = model;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }
}



