package homework;

public class Cycle {

    public static void main(String[] args) {
        int number = 3;
        int result = number;
        int power = 1;
        do {
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
            result = result * number;
        }while (result < 10000);








    }
}