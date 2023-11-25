package publicAndPrivate;

import java.util.Random;
import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {

        Car myCar = new Car("black", "Megane", "RENAULT");

        System.out.println(myCar);

        System.out.println("Модель автомобиля: " + myCar.getModel());

        //изменяем данные через сеттер и получаем ответ через геттер


        myCar.setColor("white");

        System.out.println("Цвет машины: " + myCar.getColor());

       //рандом - генерирует случайные цифры в заданном диапазоне
        Random random = new Random();
        System.out.println(random.nextInt(50));

       // сканер позволяет считывать данные вводимые с клавиатуры
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your integer number");

        int number = input.nextInt();
        System.out.println("Your number is - " + number);


        System.out.println("Please enter your double number");
        double numberDouble = input.nextDouble();
        System.out.println("Your double number is - " + numberDouble);


    }



}
