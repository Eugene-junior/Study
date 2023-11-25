package taskBank;

public class Bank {
    public static void main(String[] args) {

BankWithdraw bankWithdraw = new BankWithdraw();

    int accountBalance = bankWithdraw.getBalance();
    int dayCounter = 0;

    System.out.println("The balance is: " + accountBalance);

        while (accountBalance > 0) {
          int withDraw = BankWithdraw.getDraw(accountBalance);
          accountBalance = accountBalance - withDraw;
          dayCounter++;

        System.out.println("Day " + dayCounter + ", withdrawal is: " + withDraw + ", remain : " + accountBalance);

}
}









    }






