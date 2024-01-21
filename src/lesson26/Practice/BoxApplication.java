package Practice;

import java.util.*;

public class BoxApplication {
    public static void main(String[] args) {

        ComparatorVolume comparatorVolume = new ComparatorVolume();
        ComparatorWeight comparatorWeight  = new ComparatorWeight();

        Set<HeavyBox> boxByVolume = new TreeSet<>(comparatorVolume);
        Set<HeavyBox> boxByWeight = new TreeSet<>(comparatorWeight);

        Owner owner1 = new Owner("Vita");
        Owner owner2 = new Owner("Lora");
        Owner owner3 = new Owner("Nick");

        Map<Owner, HeavyBox> boxByOwner = new HashMap<>();
        Map<Owner, List<HeavyBox>> boxForOwner = new HashMap<>();

        boxByVolume.add(new HeavyBox(10,20,15,12));
        boxByVolume.add(new HeavyBox(20,15,10,10));
        boxByVolume.add(new HeavyBox(15,10,20,20));

        boxByWeight.add(new HeavyBox(10,20,15,12));
        boxByWeight.add(new HeavyBox(20,15,10,10));
        boxByWeight.add(new HeavyBox(15,10,20,20));












    }
}
