package HomeWork.Task5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class NameHashSet {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Elena");
        names.add("Olga");
        names.add("Alex");
        names.add("Olga");
        names.add("Eugene");
        names.add("Elena");
        names.add("Katty");
        names.add("Andriy");
        names.add("John");
        names.add("Stephan");

        System.out.println(names);
        System.out.println(names.contains("Leonid"));
        System.out.println(names.contains("Olga"));






    }


}
