package homeTasks.Arr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkService {
    int N;
    int[] NewArray = new int[N];
    Random random = new Random();
    int[] SecondArray;

    int counter;

    public HomeWorkService() {
        SecondArray = new int[counter];
    }

    public void EnterData() {
        System.out.println("Enter array size");
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        NewArray = new int[N];
        if (N > 3) {
            for (int i = 0; i <= NewArray.length - 1; i++) {
                NewArray[i] = random.nextInt(N + 1);
            }
            System.out.println("Your array content " + Arrays.toString(NewArray));
        }
        if (N <= 3) {
            System.out.println("Oops! Array must be over 3");
        }
    }

    public void EditArray(int[] NewArray) {
        int counter = 0;
        for (int i = 0; i < NewArray.length; i = i + 2) {
            counter++;}
            int[] SecondArray = new int [counter];
        System.out.println(Arrays.toString(SecondArray));
        }

        public void FillArray (int [] NewArray, int [] SecondArray){

            for (int i = 0; i < NewArray.length; i = i + 2) {
                for (int j = 0; j < SecondArray.length; j++) {

                    SecondArray[j] = NewArray[i];

                }System.out.println(Arrays.toString(SecondArray));

            }
        }
    }











