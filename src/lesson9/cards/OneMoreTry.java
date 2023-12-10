package cards;

import java.util.Arrays;
import java.util.Scanner;

public class OneMoreTry {
    public static void main(String[] args) {


        String number;

        String[] Cards = new String[52];

        for (int i = 0; i < 9; i++) {
            Cards[i] = new String(2 + i + " hearts");
        }
        for (int i = 17; i >= 9; i--) {
            Cards[i] = new String(i - 7 + " diamonds");
        }
        for (int i = 26; i > 17; i--) {
            Cards[i] = new String(i - 16 + " clubs");
        }
        for (int i = 35; i > 26; i--) {
            Cards[i] = new String(i - 25 + " spades");
        }
        for (int i = 36; i <52 ; i++) {
            Cards[36] = ("Jack hearts");
            Cards[37] = ("Queen hearts");
            Cards[38] = ("King hearts");
            Cards[39] = ("Ace hearts");
            Cards[40]= ("Jack spades");
            Cards[41] = ("Queen spades");
            Cards[42] = ("King spades");
            Cards[43] = ("Ace spades");
            Cards[44] = ("Jack clubs");
            Cards[45] = ("Queen clubs");
            Cards[46] = ("King clubs");
            Cards[47] = ("Ace clubs");
            Cards[48] = ("Jack diamonds");
            Cards[49] = ("Queen diamonds");
            Cards[50] = ("King diamonds");
            Cards[51] = ("Ace diamonds");
        }
        //System.out.println(Arrays.toString(Cards));

        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.println("Enter number of players");
        N = scanner.nextInt();

        //int cardIndex = (int)Math.floor(Math.random() * Cards.length);

        int counter = 0;
        boolean condition = counter <= N;
        while (condition) {

            for (int i = 0; i < 5; i++) {

                int cardIndex = (int)Math.floor(Math.random() * Cards.length);
                System.out.println(Cards[cardIndex]);

            } counter++;

            System.out.println("======================================");


                if (counter >= N) condition = false;

            }

        }

        }
















