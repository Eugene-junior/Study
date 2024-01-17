package Comparator.Task2;

import java.util.Comparator;

public class ComparatorSize implements Comparator<SuitCase> {
    @Override
    public int compare(SuitCase s1, SuitCase s2) {
        return s1.getSize().compareTo(s2.getSize());
    }
}
