package homework;

import java.util.Scanner;

public class MyInput {

    Scanner scanner = new Scanner(System.in);

    public int myInputInt(){
    int input = scanner.nextInt();
    return input;
}

    public double myInputDouble(){
        double input = scanner.nextDouble();
        return input;
    }
        public String myInputText(){
            String input = scanner.nextLine();
            return input;
        }






}
