package Comparator.Task2;

import java.util.Comparator;

public class ComparatorCombined {

    Comparator<SuitCase>BySize = new ComparatorSize();
    Comparator<SuitCase>ByColor = new ComparatorColor();
    Comparator<SuitCase>ByMaterial = new ComparatorMaterial();

    Comparator<SuitCase> comparatorCombined = BySize.thenComparing(ByColor.thenComparing(ByMaterial));

    public Comparator<SuitCase> getComparatorCombined() {
        return comparatorCombined;
    }
}
