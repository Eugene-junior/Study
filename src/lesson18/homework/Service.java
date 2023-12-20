package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Service {

    private int N;

    Shape [] MyShape;
    Random random = new Random();

     public void CreateArray(){
         N = random.nextInt(10,20);
         MyShape = new Shape[N];
         System.out.println(Arrays.toString(MyShape));
    }


    Quadrate quadrate = new Quadrate("Quadrate", random.nextInt(10,20));
    Circle circle = new Circle("Circle", random.nextInt(10, 20));
    Rectangle rectangle = new Rectangle("Rectangle", random.nextInt(10,20), 20);
    Triangle triangle = new Triangle("Triangle", random.nextInt(10,20),(random.nextInt(10,20)),(random.nextInt(10,20)),(random.nextInt(10,20)));



    public void RandomShape(){
        Shape[] RandomShape = {new Quadrate("Quadrate", random.nextInt(10,20)), new Circle("Circle", random.nextInt(10, 20)), new Rectangle("Rectangle", random.nextInt(10,20), 20), new Triangle("Triangle", random.nextInt(10,20),(random.nextInt(10,20)),(random.nextInt(10,20)),(random.nextInt(10,20)))};
      int counter = 0;
        for (int i = 0; i < MyShape.length; i++) {
          int M = random.nextInt(0,4);
           MyShape[counter] = RandomShape[M];
            counter++;
        }
        System.out.println(Arrays.toString(RandomShape));
        System.out.println(Arrays.toString(MyShape));
            }




}















