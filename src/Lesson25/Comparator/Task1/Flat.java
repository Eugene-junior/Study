package Comparator.Task1;

public class Flat implements Comparable<Flat> {
    private double Area;
    private int BedRooms;

    public Flat(double area, int bedRooms) {
        Area = area;
        BedRooms = bedRooms;
    }

    public double getArea() {
        return Area;
    }

    public int getBedRooms() {
        return BedRooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "Area=" + Area +
                ", BedRooms=" + BedRooms +
                '}';
    }

    @Override
    public int compareTo(Flat another) {
        if (BedRooms != another.getBedRooms())
        return BedRooms - another.getBedRooms();
        else return Double.compare(Area, another.getArea());
    }
}
