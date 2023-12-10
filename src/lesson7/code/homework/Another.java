package code.homework;

import java.util.Scanner;

public class Another {
    public static void main(String[] args) {

        int i, x;


        System.out.println("Put your number");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        int k = 0;

        for (i = 1; i <= x; i++) {
            if (x % i == 0) {
                k++;

            }

            else if (k > 2) {
                System.out.println(x + " false");
                k = 0;

            }



            }



        }

    }



