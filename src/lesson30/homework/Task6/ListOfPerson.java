package homework.Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfPerson {
    public static void main(String[] args) {

        List<Person>myList = new ArrayList<>();

        myList.add(new Person("Oleg", 25));
        myList.add(new Person("Olga", 21));
        myList.add(new Person("Alex", 35));
        myList.add(new Person("Helen", 45));
        myList.add(new Person("Taras", 27));
        System.out.println(myList);

        myList.sort(new AgeComparator());
        System.out.println("Sorted list: " + myList);






    }
}
