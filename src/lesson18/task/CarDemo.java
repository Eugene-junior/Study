package task;

public class CarDemo {
    public static void main(String[] args) {

        Sedan sedan1 = new Sedan("Toyota", 50);
        Sedan sedan2 = new Sedan("Volvo", 55);

        SportCar sportCar1 = new SportCar("Ferrari", 100);
        SportCar sportCar2 = new SportCar("Bugatti", 150);

        Truck truck1 = new Truck("Iveco", 45);
        Truck truck2 = new Truck("Mercedes", 40);

        Cars [] cars = {sportCar1, sportCar2, sedan1, sedan2, truck1, truck2};

        for (int i = 0; i < cars.length; i++) {
            cars[i].Speedy();

        }





    }
}
