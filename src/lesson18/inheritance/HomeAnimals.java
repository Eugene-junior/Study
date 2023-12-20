package inheritance;

import java.util.Arrays;

public class HomeAnimals {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Barbos");
        Dog dog2 = new Dog("Palkan");


        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Barsik");

        Dog[] dogs = {dog1, dog2};
        Cat[] cats = {cat1, cat2};


        System.out.println("Cats names: " + Arrays.toString(cats));
        System.out.println("Dogs names: " + Arrays.toString(dogs));

        System.out.println("Cats names: " + cat1.getName()+ ",  " + cat2.getName());
        System.out.println("Dogs names: " + dog1.getName() + ",  " + dog2.getName());


        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getName());}

            for (int j = 0; j < cats.length; j++) {
                System.out.println(cats[j].getName());
            }

        }
    }

