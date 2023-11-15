package robot;

import java.sql.SQLOutput;

public class Robot {

String mark;

    public Robot(String mark) {this.mark = mark;}

    public void Hello(){
    System.out.println("Hello!");
    System.out.println("I am robot " + mark);

    }

     public double currencyConverter(double usdValue, double currencyExchange){
     double eurValue = usdValue*currencyExchange;
     return eurValue;


     }

}
