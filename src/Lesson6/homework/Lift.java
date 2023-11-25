package homework;

public class Lift {

    public static void main(String[] args) {

        int sum = 0;
        int floor = 1;
        int stepUp = 30;
        int stepDown = 2;
        int height = 25 - floor;
        int counter = 0;
        boolean condition = true;

        while (condition){
            sum += stepUp - stepDown;

            counter ++;
            if (sum >= height){
            break;
            }

            if (sum + stepUp >= height) {
                 condition = false;
                 counter++;

             } }
        System.out.println("Количество подьемов " + counter);

        }


        }








