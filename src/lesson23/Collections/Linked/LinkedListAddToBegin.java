package Collections.Linked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAddToBegin {
    public static void main(String[] args) {

    List<Integer> integerList = new LinkedList<>();


        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            integerList.add(0, i);

        }
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println(integerList.size());
        System.out.println("Passed time is " + result);





    }
}
