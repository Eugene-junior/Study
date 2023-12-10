package homeTasks.Array;

import java.util.Arrays;
import java.util.Random;

public class TwoArraysTask {

    public static void main(String[] args) {
        Random random = new Random();
        int[] First = new int[5];
        int[] Second = new int[5];
        Average average = new Average();

        for (int i = 0; i < First.length; i++) {
            First[i] = random.nextInt(6);
        }
        System.out.println("First array " + Arrays.toString(First));


        for (int i = 0; i < Second.length; i++) {
            Second[i] = random.nextInt(6);
        }
        System.out.println("Second array " + Arrays.toString(Second));

        int Result1 = average.Average(First);
        int Result2 = average.Average(Second);
         if (Result1 > Result2) {
            System.out.println("Average of First is bigger");}
            if (Result1 < Result2){
                System.out.println("Average of Second is bigger ");}

            if (Result1 == Result2){ System.out.println(" Arrays have the same average ");}
    }
        }











