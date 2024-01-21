package Practice;

import java.util.Comparator;

public class ComparatorLengths implements Comparator<HeavyBox> {
    @Override
    public int compare(HeavyBox box1, HeavyBox box2) {
        return Double.compare (box1.getLengths(), box2.getLengths());
    }
}
