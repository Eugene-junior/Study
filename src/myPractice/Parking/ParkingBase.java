package Parking;

public class ParkingBase extends Levels{
    public ParkingBase(int number, String model, String plate) {
        super(number, model, plate);
    }

    Levels car1 = new Levels(1, "BMW", "14-07 FR");
    Levels car2 = new Levels(2, "Volvo","111 NW");

    public void SetCar (){

    }















    @Override
    public void setNumber(int number) {
        super.setNumber(number);
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public void setPlate(String plate) {
        super.setPlate(plate);
    }

    @Override
    public boolean freePlace() {
        return super.freePlace();
    }
}
