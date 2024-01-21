package Practice;

import java.util.Comparator;

public class ComparatorHeight implements Comparator<HeavyBox> {
    @Override
    public int compare(HeavyBox box1, HeavyBox box2) {
        return Double.compare (box1.getHeight(), box2.getHeight());
    }
}
