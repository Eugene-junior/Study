package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {


    public static void binary (int arr[], int first, int last, int x){

       int mid = (first + last)/2;

       while (first <= last) {
           if (arr[mid] < x) {
               first = mid + 1;
           } else if (arr[mid] == x) {
               System.out.println("Your number is " + x + " with index " + mid);
               break;
           } else {
               last = mid - 1;
           }
           mid = (first + last) / 2;
           } if (first > last) {
            System.out.println("not found");
        }
       }
    public static void main(String[] args) {

        int[] NewArray = {1, 23, 32, 45, 54, 87, 89, 96, 111, 234, 456, 555};
        System.out.println("enter number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int last = NewArray.length- 1;

        binary(NewArray, 0, last, x);






    }

}















