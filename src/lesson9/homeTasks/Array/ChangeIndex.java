package homeTasks.Array;

import java.util.Arrays;
import java.util.Random;

public class ChangeIndex {

    public static void main(String[] args) {
        Random random = new Random();
        int [] eights = new int [8];
        for (int i = 0; i < eights.length; i++) {
            eights[i] = random.nextInt(1,11);
        }
        System.out.println("Our array " + Arrays.toString(eights));

        for (int i = 1; i < eights.length; i = i + 2) {
            eights[i] = 0;
        }
        System.out.println("Changed array " + Arrays.toString(eights));
    }

}
