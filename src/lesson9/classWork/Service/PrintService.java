package classWork.Service;

import classWork.Card;
import classWork.Player;

import java.util.Arrays;

public class PrintService {




    public void printDeck(Card[] workingDeck, String message){
        System.out.println(message);

        int counter = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                //System.out.print(workingDeck[counter] + ", ");
                System.out.print(workingDeck[counter].getValue()+workingDeck[counter].getSuit() + ", ");
                counter++;
            }
            System.out.println();
        }
    }

    public void printPlayers(Player[] players){


        for (int i = 0; i < players.length; i++) {
            System.out.println("------" + players[i].getName() + "--------------");
            System.out.println(Arrays.toString(players[i].getPlayerCards()));
            //printCard(players[i].playersCards);
            System.out.println();
        }
    }

}
