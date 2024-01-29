package homework.Task1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListChange {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add(0,"set");
        linkedList.add(1,"pet");
        linkedList.add(2,"set");
        linkedList.add(3,"hat");
        linkedList.add(4,"cap");
        System.out.println(linkedList);

        //Set<String>change = new HashSet<>(linkedList);
        //System.out.println(change);

        Service service = new Service();
        HashSet<String> changed = service.changeList(linkedList);
        System.out.println(changed);







        }



    }




