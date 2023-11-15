package car;

public class Car {

    String model;
    double engine;
    String color;
    boolean transmissionAuto;

    public Car(String model, double engine, String color, boolean transmissionAuto) {
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.transmissionAuto = transmissionAuto;
    }

public void beep(){
    System.out.println("This is " + model + "! BEEP!");
}
    public void start(){
        String textMessage = "Start engine! ";
        System.out.println(textMessage + engine);
    }
public void startEngine(){
    System.out.println("This is " + model + engine + "colour" + transmissionAuto + "! starting engine !" );

}



}

