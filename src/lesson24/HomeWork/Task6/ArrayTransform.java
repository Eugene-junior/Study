package HomeWork.Task6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayTransform {
    public static void main(String[] args) {
        List<String> TownList = new ArrayList<>();
        TownList.add("London");
        TownList.add("Seattle");
        TownList.add("Berlin");
        TownList.add("Ottawa");
        TownList.add("Berlin");
        TownList.add("London");
        TownList.add("Paris");
        System.out.println(TownList);

        System.out.println("===========================");

        Set<String> TownSet = new HashSet<>();

        TownSet.addAll(TownList);
        System.out.println("Town list without duplicates: " + TownSet);
        System.out.println("============================");

        TownSet.add("Rome");
        TownSet.add("Kiev");
        System.out.println("New town list: " + TownSet);

        List<String> NewTownList = new ArrayList<>(TownSet);
        System.out.println("Array mode: " + NewTownList);

    }















    }

