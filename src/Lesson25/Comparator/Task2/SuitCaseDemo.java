package Comparator.Task2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class SuitCaseDemo {
    public static void main(String[] args) {
        ComparatorCombined comparatorCombined = new ComparatorCombined();

        TreeSet<SuitCase>OurSuitcases = new TreeSet<>(comparatorCombined.getComparatorCombined());
        OurSuitcases.add(new SuitCase("Black","Fabric","L"));
        OurSuitcases.add(new SuitCase("Blue","Fabric","L"));
        OurSuitcases.add(new SuitCase("Grey","Plastic","M"));

        System.out.println(OurSuitcases);

        LinkedList<SuitCase>NewSuitcases = new LinkedList<>();
        NewSuitcases.add(new SuitCase("White","Fabric","M"));
        NewSuitcases.add(new SuitCase("White","Plastic","M"));
        System.out.println(NewSuitcases);


    }
}
