package homework.Task3;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer>ourList = new ArrayList<>();
        ourList.add(1);
        ourList.add(2);
        ourList.add(5);
        ourList.add(9);
        ourList.add(0,25);

        System.out.println(ourList);
        System.out.println(ourList.isEmpty());
        System.out.println("-----------------");

        ourList.remove(1);
        System.out.println(ourList);

        ourList.addFirst(0);
        ourList.addLast(88);
        System.out.println(ourList);


    }
}
