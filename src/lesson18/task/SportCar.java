package task;

public class SportCar extends Cars {
    public SportCar(String model, int speed) {
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
        System.out.println("our sportcar " + getModel() + " run " + getSpeed() +" km/h");
        setSpeed(getSpeed() + 60);
        System.out.println("and speed up for " + getSpeed());
    }
}
