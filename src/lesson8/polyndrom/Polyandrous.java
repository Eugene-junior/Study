package polyndrom;

import java.util.Scanner;

public class Polyandrous {

    public static void main(String[] args) {
        PolyandrousService serviceWord = new PolyandrousService();
        System.out.println("Enter your word");
        Scanner scanner = new Scanner(System.in);
        String word;
        String word1;

        word = scanner.nextLine();
        System.out.println("You choose: " + word);
        boolean ifPolyandrous = true;
        serviceWord.serviceWord(word);




        }



    }












