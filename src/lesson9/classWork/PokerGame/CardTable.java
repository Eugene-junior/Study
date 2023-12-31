package classWork.PokerGame;

import classWork.Cards;
import classWork.Player;
import classWork.Service.DeckService;
import classWork.Service.InputData;
import classWork.Service.PrintService;
import classWork.Service.TableService;

public class CardTable {

    Cards cards = new Cards();

    DeckService deckService = new DeckService();
    TableService cardTableUtil= new TableService();
    PrintService printServices = new PrintService();

    InputData iData = new InputData();
    public int numberOfPayers = iData.enterNumberOfPlayers();
    public Player[] players = new Player[numberOfPayers];

    int numberCardsForEachPlayer = 5;

    public void game(){

        deckService.fillDeck(cards.getDeck());
        printServices.printDeck(cards.getDeck(), "----------- Create New Deck -----------");

        cards.setDeckShuffle(deckService.deckShuffle(cards.getDeck()));

        printServices.printDeck(cards.getDeckShuffle(), "--------- Deck after shuffle --------");

        cardTableUtil.createPlayers(players);
        cardTableUtil.dealCards(cards.getDeckShuffle(), numberCardsForEachPlayer, numberOfPayers, players);
        printServices.printPlayers(players);



    }






}
