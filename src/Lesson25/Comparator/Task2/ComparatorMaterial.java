package Comparator.Task2;

import java.util.Comparator;

public class ComparatorMaterial implements Comparator<SuitCase> {
    @Override
    public int compare(SuitCase s1, SuitCase s2) {
        return s1.getMaterial().compareTo(s2.getMaterial());
    }
}
