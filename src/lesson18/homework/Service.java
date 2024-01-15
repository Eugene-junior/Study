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
         System.out.println("Your array size is: " + N );
    }

    public void FillMyShape(){

      int counter = 0;
        for (int i = 0; i < MyShape.length; i++) {
          Shape[] RandomShape = {new Quadrate("Quadrate", random.nextInt(10,20)), new Circle("Circle", random.nextInt(10, 20)), new Rectangle("Rectangle", random.nextInt(10,20), 20), new Triangle("Triangle", random.nextInt(10,20),(random.nextInt(10,20)),(random.nextInt(10,20)),(random.nextInt(10,20)))};
          int M = random.nextInt(0,4);

          MyShape[counter] = RandomShape[M];

            counter++;
        }

        System.out.println(Arrays.toString(MyShape));
            }

        public void AreaShapes(){
            for (int i = 0; i < MyShape.length; i++) {
                MyShape[i].CalculatorSquare();
                System.out.println("Area of shape " + (i + 1) + " " + MyShape[i].getName() + " is " + MyShape[i].CalculatorSquare());


            }
        }

        public void PerimeterShapes(){
            for (int i = 0; i < MyShape.length; i++) {
                MyShape[i].CalculatorPerimeter();
                System.out.println("Perimeter of shape " + (i + 1) + " " + MyShape[i].getName() + " is " + MyShape[i].CalculatorPerimeter());

            }
        }


}















