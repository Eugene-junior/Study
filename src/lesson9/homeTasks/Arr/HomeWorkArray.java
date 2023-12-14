package homeTasks.Arr;

import homeTasks.FillArray;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkArray {
    public static void main(String[] args) {

    HomeWorkService hm = new HomeWorkService();
    hm.EnterData();
    hm.EditArray(hm.NewArray);

    hm.FillArray(hm.NewArray, hm.SecondArray);



    }
}
