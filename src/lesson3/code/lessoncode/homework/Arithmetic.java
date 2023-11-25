package homework;

public class Arithmetic {


    public static void main(String[] args) {

        double random1= Math.random() * (10.5 - 0.0 + 1.5) + 1.5;
        double random2= Math.random() * (20 - 11 + 1) + 11;
    // задание диапазона от мин до макс (max - min + 1) + min;

        double random3= Math.random() * 100;
        double random4= Math.random() * 100;
        double random5= Math.random() * 100;
        System.out.println("1st number is: " + Math.round(random1));
        System.out.println("2nd number is: " + Math.round(random2));
        System.out.println("3th number is: " + Math.round(random3));
        System.out.println("4th number is: " + Math.round(random4));
        System.out.println("5th number is: " + Math.round(random5));

    }


}
