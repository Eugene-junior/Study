package binarySearch.ArraySearch;

import java.util.Scanner;

public class UserControl {

    public boolean contains (int[] array, int N){
            boolean control = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == N){
            control = true;
            }
        } return control;



    }

   public int howManyTimes (int[] array, int N){
       int counter = 0;
       for (int i = 0; i < array.length; i++) {
             if (N == array[i]){
                     counter++;
           }
           } return counter;

       }




        Scanner scanner = new Scanner(System.in);


    public boolean change (int [] array){
        System.out.println("Enter your number to change");
        int N = scanner.nextInt();
        System.out.println("Enter which number you want" );
        int M = scanner.nextInt();
        boolean change = false;

        for (int i = 0; i < array.length; i++) {
            if (N == array[i]){
                array[i] = M;
                change = true;
            }

        } return change;
    }
   }




