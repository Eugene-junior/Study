package HomeWork.Task2;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOfNumbers {
    public static void main(String[] args) {
        Service search = new Service();

        List<Integer> myNumbers = new LinkedList<>();
        myNumbers.add(27);
        myNumbers.add(5);
        myNumbers.add(12);
        myNumbers.add(8);
        myNumbers.add(0);

        search.SearchMax(myNumbers);
        search.SearchMin(myNumbers);
        search.Sorting(myNumbers);










    }


}
