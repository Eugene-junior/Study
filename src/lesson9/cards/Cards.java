package cards;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {

        String[] hearts = new String[13];
        String[] diamonds = new String[13];
        String[] clubs = new String[13];
        String[] spades = new String[13];



        for (int i = 0; i < 9; i++) {
            hearts[i] = new String(2 + i + " hearts");
        }
        for (int i = 9; i <= hearts.length; i++) {

            hearts[9] = ("Jack hearts");
            hearts[10] = ("Queen hearts");
            hearts[11] = ("King hearts");
            hearts[12] = ("Ace hearts");
        }
// ============================================================================

            for (int j = 0; j < 9; j++) {
                diamonds[j] = new String (2 + j +" diamonds");
            }
        for (int j = 9; j <= diamonds.length ; j++) {
            diamonds[9] = ("Jack diamonds");
            diamonds[10] = ("Queen diamonds");
            diamonds[11] = ("King diamonds");
            diamonds[12] = ("Ace diamonds");
        }

// ===========================================================================

        for (int k = 0; k < 9; k++) {
                    clubs[k] = new String(2 + k + " clubs");
        }

        for (int k = 9; k <= clubs.length ; k++) {
            clubs[9] = ("Jack clubs");
            clubs[10] = ("Queen clubs");
            clubs[11] = ("King clubs");
            clubs[12] = ("Ace clubs");
        }

//  ==============================================================================

         for (int s = 0; s < 9; s++) {
               spades[s] = new String (2 + s + " spades");
         }
        for (int s = 9; s <= spades.length ; s++) {
            spades[9] = ("Jack spades");
            spades[10] = ("Queen spades");
            spades[11] = ("King spades");
            spades[12] = ("Ace spades");
        }

        String [] cards = new String [] {Arrays.toString(hearts), Arrays.toString(diamonds), Arrays.toString(clubs), Arrays.toString(spades)};
         //int cardIndex = (int)Math.floor(Math.random() * cards.length);
         //System.out.println(cards[cardIndex]);


        System.out.println(Arrays.deepToString(cards));

        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.println("Enter number of players");
        N = scanner.nextInt();
        System.out.println(cards);









    }



}


















