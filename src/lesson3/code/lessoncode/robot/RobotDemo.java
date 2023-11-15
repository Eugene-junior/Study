package robot;

public class RobotDemo {
    public static void main(String[] args) {

        Robot myRobot = new Robot("Google");
        myRobot.Hello();

        Robot myRobot2 = new Robot("SONY");
        myRobot2.Hello();

        double eurValue = myRobot2.currencyConverter(100, 0.95);
        System.out.println("Из ста долларов мы получим " + eurValue + " euro ");









    }
}
