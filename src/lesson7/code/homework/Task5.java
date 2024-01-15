package code.homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int N = 0;
         int counter1 = 0;
         int quantity1 = 0;
         int counter2 = 0;
         int quantity2 = 0;
         System.out.println("Write your number");
        N = scanner.nextInt();



            for (int i = N; i > 0; i = i - 2) {
               quantity1 += i - 2;
               counter1++; }

             for (int j = N - 1; j > 0 ; j = j - 2) {
            quantity2 += j -2;
            counter2++;

        }




          System.out.println(counter1);
           System.out.println(counter2);


    }


}



















