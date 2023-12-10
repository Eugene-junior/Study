package binarySearch;

public class UtilBinary2 {

    public static void indexSearch (int [] NewArray, int x, int i){
        while (NewArray[i] != x) {
            if (NewArray[i] > x) {
                i = i  / 2;
            }
            if (NewArray[i] < x) {
                i =  i + 1;
            }

        }
        System.out.println("Your number is " + x + " with index: " + i);





    }

}
