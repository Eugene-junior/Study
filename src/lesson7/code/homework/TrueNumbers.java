package code.homework;


import java.util.Scanner;

public class TrueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int N = scanner.nextInt();



        if (((N % N == 0)&&(N % 1 == 0))){
              System.out.println( + N + " Это простое число ");
        }
        else {
        System.out.println("Это составное число");}





    }






}



