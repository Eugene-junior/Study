package polyndrom;

public class PolyandrousService {


    public void serviceWord (String text){

        int L = text.length();
        for (int i = L - 1; i >= 0; i--) {

            System.out.println(text.charAt(i));

        }



    }


    }
