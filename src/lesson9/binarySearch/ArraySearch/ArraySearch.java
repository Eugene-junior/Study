package binarySearch.ArraySearch;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean condition = false;
        int[] array = {1,2,2,4,5,6,2,8,8,10};
        int N;

        System.out.println("Enter your number");
        N = scanner.nextInt();

        UserControl control = new UserControl();
        condition = control.contains(array, N);
        System.out.println(condition);

        int HowManyTimes = control.howManyTimes(array, N);
        System.out.println("Your number " + N + " happens " + HowManyTimes + " times ");

        condition = control.change(array);
        System.out.println(condition);
        System.out.println(Arrays.toString(array));
    }

        }



