package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskArray {
    public static void main(String[] args) {
     Random random = new Random();
     Scanner scanner = new Scanner(System.in);
     SearchForMin searchForMin = new SearchForMin();
     SearchForMax searchForMax = new SearchForMax();

     System.out.println("Enter your arrow size");

     int sizeArray = scanner.nextInt();

     int [] MyArray = new int [sizeArray];
        for (int i = 0; i < MyArray.length; i++) {
        MyArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(MyArray));

       searchForMax.maxSearch(MyArray);
       searchForMin.minSearch(MyArray);






        }
        }




