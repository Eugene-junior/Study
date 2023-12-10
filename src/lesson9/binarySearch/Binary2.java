package binarySearch;

import java.util.Scanner;

public class Binary2 {
    public static void main(String[] args) {
        UtilBinary2 utilBinary2 = new UtilBinary2();
        int[] NewArray = {1, 23, 32, 45, 54, 87, 89, 96, 111, 234, 456, 555, 580, 585, 600, 602, 652, 758};
        int i = NewArray.length / 2;
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean trueNumber = false;

        for (int j = 0; j < NewArray.length; j++) {
                if (NewArray[j] == x) {
                    trueNumber = true;
                    UtilBinary2.indexSearch(NewArray, x, i);
                    break;
                }



            }
        System.out.println(trueNumber);

            }


        }


