package code.homework;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четное число");

        int sum = 0;

        int N = scanner.nextInt();

        for (int i = 2; i <= N; i = i + 2) {

            sum+=i;

        }
        System.out.println("Сумма четных чисел будет: " + sum);





        }





    }



















