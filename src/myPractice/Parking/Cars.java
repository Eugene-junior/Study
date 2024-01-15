package Parking;

abstract class Cars {
    private int number;
    private String model;
    private String plate;


    public Cars(int number, String model, String plate) {
        this.number = number;
        this.model = model;
        this.plate = plate;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}

