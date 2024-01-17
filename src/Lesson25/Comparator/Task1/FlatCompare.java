package Comparator.Task1;

import java.util.TreeSet;

public class FlatCompare {
    public static void main(String[] args) {

        TreeSet<Flat>flats = new TreeSet<>();
        flats.add(new Flat(50.0,2));
        flats.add(new Flat(25.8,1));
        flats.add(new Flat(74.6,3));
        flats.add(new Flat(50.0,2));

        System.out.println(flats);



    }
}
