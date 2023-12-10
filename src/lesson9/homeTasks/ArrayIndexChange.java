package homeTasks;

import java.util.Arrays;

public class ArrayIndexChange {
    public static void main(String[] args) {
        String[] stringArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11","12","13"};
        System.out.println("Array original");

        System.out.println(Arrays.toString(stringArray));
        // FillArray fill = new FillArray();

        // String [] newArray = fill.fillArray(stringArray);
        //System.out.println(Arrays.toString(newArray));

        Method method = new Method();
        method.Invert(stringArray);
        System.out.println("================");
        System.out.println("Reverse Array");
        System.out.println(Arrays.toString(stringArray));



    }
}
















