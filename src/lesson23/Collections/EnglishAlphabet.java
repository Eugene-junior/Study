package Collections;

import java.util.ArrayList;

public class EnglishAlphabet {
    public static void main(String[] args) {


        ArrayList<String> English = new ArrayList<>();
        for (char letter = 'A'; letter <= 'J'; letter++) {
         English.add(String.valueOf(letter));
        }
        System.out.println(English);

        }
            






}
