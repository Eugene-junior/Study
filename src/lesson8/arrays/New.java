package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class New {

    public static void main(String[] args) {
     Random random = new Random();
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter your arrow size");

     int sizeArray = scanner.nextInt();

     int [] MyArray = new int [sizeArray];
        for (int i = 0; i < MyArray.length; i++) {
        MyArray[i] = random.nextInt(100);

        }
        System.out.println(Arrays.toString(MyArray));

        int max = MyArray[0];
        int indexMax = 0;

        for (int i = 0; i < MyArray.length; i++) {
            if (MyArray[i] < max) {
                max = MyArray[i];
                indexMax = i;
            }
        }
        System.out.println(max);
        }
        }




