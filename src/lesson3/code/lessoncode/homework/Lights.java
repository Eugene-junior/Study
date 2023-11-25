package homework;

import java.util.Scanner;

public class Lights {
    public static void main(String[] args) {

    String redLight = "RED";
    String yellowLight = "YELLOW";
    String greenLight = "GREEN";


    Scanner lightScan = new Scanner(System.in);

    System.out.println("Which colour of the light? ");
    String colour = lightScan.nextLine();


    if (colour.equals("GREEN")) {
        System.out.println("You can go!");
    }
      else if (colour.equals("YELLOW")) {
        System.out.println("Please wait!");
    }
       else  {
        System.out.println("Stay hold!");
     }








}
}