package homeTasks;

import java.util.Arrays;

public class FillArray {


    String [] stringArray = new String[20];

    public String [] fillArray (String [] stringArray){
        String[] numbers = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
        int counter = 0;
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[counter] = numbers[i];
            counter++;

        }return stringArray;

    }
}
