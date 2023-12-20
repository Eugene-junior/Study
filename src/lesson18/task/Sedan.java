package task;

public class Sedan extends Cars{

    public Sedan(String model, int speed) {
        super(model, speed);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public void Speedy() {
        super.Speedy();
        System.out.println("our sedan " + getModel() + " run " + getSpeed() + " km/h");
        setSpeed(getSpeed() + 30);
        System.out.println("speed up for " + getSpeed());
    }
}
