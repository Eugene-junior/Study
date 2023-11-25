package taskBank;

import java.util.Random;

public class BankWithdraw {



  public int getBalance (){
      Random random = new Random();
      return random.nextInt(5000);
  }

  public static int getDraw (int balance){
      for (int i = balance / 2; i > 0 ; i--) {
          if (balance % 2 == 0) {
              return i;
          }

      } return 1;


  }








}
