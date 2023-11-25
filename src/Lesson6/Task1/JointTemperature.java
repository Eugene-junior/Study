package Task1;

import java.util.Scanner;

public class JointTemperature {

    public static void main(String[] args) {

    double temperature1;
    double temperature2;
    System.out.println("Temperature1 could not be lower than 100°C and temperature2 could not be higher than 100°C");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input value of temperature1 ");
    temperature1 = scanner.nextDouble();
    System.out.println("Input value of temperature2: ");
    temperature2 = scanner.nextDouble();
    if (temperature1 >= 100 && temperature2 < 100) {
        System.out.println("Joint have been controlled");
    }
    else {
        System.out.println("False");
    }


    }
}


