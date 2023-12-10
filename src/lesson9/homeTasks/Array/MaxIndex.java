package homeTasks.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class MaxIndex {
    public static void main(String[] args) {
        Random random = new Random();
        int [] Casual = new int [12];
        for (int i = 0; i < Casual.length; i++) {
            Casual[i] = random.nextInt(-15,15);
        }

        System.out.println("Our array is " + Arrays.toString(Casual));
        int Max = Casual[0];
        int MaxIndex = 0;
        for (int i = 1; i < Casual.length; i++) {
             if (Casual[i] >= Max){
                Max = Casual[i];
                MaxIndex = i;
            }

                }
        System.out.println("Maximum number is " + Max + " with index " + MaxIndex);



    }
}
