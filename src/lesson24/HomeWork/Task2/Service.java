package HomeWork.Task2;

import java.util.Collections;
import java.util.List;

public class Service {

    public void SearchMax(List<Integer> myNumbers) {

        int max = myNumbers.get(0);

        for (int i = 0; i < myNumbers.size(); i++) {

            if (myNumbers.get(i) >= max) {
                max = myNumbers.get(i);
            }
        }
        System.out.println("Maximum is " + max);
    }

    public void SearchMin(List<Integer> myNumbers) {

        int min = myNumbers.get(0);

        for (int i = 0; i < myNumbers.size(); i++) {

            if (myNumbers.get(i) <= min) {
                min = myNumbers.get(i);
            }
        }
        System.out.println("Minimum is " + min);
    }

    public void Sorting (List<Integer>myNumbers){
         for (int i = 0; i < myNumbers.size(); i++) {
         Collections.sort(myNumbers);
            }
        System.out.println(myNumbers);
        }
    }





