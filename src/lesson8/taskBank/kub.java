package taskBank;

import java.util.Scanner;

public class kub {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int N = scanner.nextInt();
        for (int i = 1; i <= N ; i++) {


            System.out.println("Кубы чисел будут равны : " + (i*i*i));
        }

    }
}
