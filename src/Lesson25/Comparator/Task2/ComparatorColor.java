package Comparator.Task2;

import java.util.Comparator;

public class ComparatorColor implements Comparator<SuitCase> {
    @Override
    public int compare(SuitCase s1, SuitCase s2) {
        return s1.getColor().compareTo(s2.getColor());
    }
}
