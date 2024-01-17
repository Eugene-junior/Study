package Comparator.Task2;

public class SuitCase {

    String color;
    String material;
    String size;

    public SuitCase(String color, String material, String size) {
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "SuitCase{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
