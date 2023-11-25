package homework;

public class Clock {

    public static void main(String[] args) {

     int time = (int) (Math.random() * (28800));

     System.out.println("Осталось " + Math.round(time) + " секунд");

     int time1 = time / 3600;
     if (time1 <1){
         System.out.println("Осталось менее часа");
     }
     else {
         System.out.println("Осталось " + Math.round(time1) + " часов");
     }








    }

}
