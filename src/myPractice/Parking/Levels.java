package Parking;

public class Levels extends Cars {

    Cars[] level1 = new Cars[20];
    Cars[] level2 = new Cars[20];
    Cars[] level3 = new Cars[20];

    public Levels(int number, String model, String plate) {
        super(number, model, plate);
    }

    public Cars[] getLevel1() {
        return level1;
    }

    public Cars[] getLevel2() {
        return level2;
    }

    public Cars[] getLevel3() {
        return level3;
    }


    public boolean freePlace() {
        boolean freePlace = true;
        Cars[][] parking = {level1, level2, level3};
        for (int i = 0; i < level1.length; i++)
            if (parking[i] == null) {
                System.out.println("Free place " + i + " at level 1");
                for (int j = 0; j < level2.length; j++)
                    if (parking[j] == null) {
                        System.out.println("Free place " + j + " at level 2");
                        for (int k = 0; k < level3.length; k++) {
                            if (parking[k] == null) {
                                System.out.println("Free place " + k + " at level 3");

                            }

                        }


                    }


            }
        return freePlace = false;

    }
}