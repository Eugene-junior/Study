package phone;

public class Phone {

    private int imei;
    private SimCard SimCard;
    private String Model;

    public Phone(int imei, String model) {
        this.imei = imei;
        Model = model;
    }

    public int getImei() {
        return imei;
    }

    public phone.SimCard getSimCard() {
        return SimCard;
    }

    public String getModel() {
        return Model;
    }

    public void setSimCard(phone.SimCard simCard) {
        SimCard = simCard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "imei=" + imei +
                ", SimCard=" + SimCard +
                ", Model='" + Model + '\'' +
                '}';
    }
}




