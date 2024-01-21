package Practice;

import java.util.Objects;

public class HeavyBox implements Comparable<HeavyBox>{

    private double weight;
    private double lengths;
    private double height;
    private double width;

    public HeavyBox(double weight, double lengths, double height, double width) {
        this.weight = weight;
        this.lengths = lengths;
        this.height = height;
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public double getLengths() {
        return lengths;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    public double getVolume() {
        return lengths * height * width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return Double.compare(weight, heavyBox.weight) == 0 && Double.compare(lengths, heavyBox.lengths) == 0 && Double.compare(height, heavyBox.height) == 0 && Double.compare(width, heavyBox.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, lengths, height, width);
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", lengths=" + lengths +
                ", height=" + height +
                ", width=" + width +
                ", volume=" + getVolume() +
                '}';
    }

    @Override
    public int compareTo(HeavyBox o) {
        return 0;
    }
}
