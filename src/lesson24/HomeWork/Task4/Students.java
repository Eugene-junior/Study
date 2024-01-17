package HomeWork.Task4;


import java.util.Objects;

public class Students implements Comparable <Students> {

    private String name;
    private double avRange;

    public Students(String name, double avRange) {
        this.name = name;
        this.avRange = avRange;
    }

    public String getName() {
        return name;
    }

    public double getAvRange() {
        return avRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(name, students.name) && Objects.equals(avRange, students.avRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avRange);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", avRange='" + avRange + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students students) {
        return (int) (avRange - students.getAvRange());
    }
}