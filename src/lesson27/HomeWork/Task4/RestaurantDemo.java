package HomeWork.Task4;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RestaurantDemo {
    public static void main(String[] args) {

        RestaurantService Service = new RestaurantService();
        Service.MakeMenu();
        System.out.println();

        Set<Order>OrderToday = new HashSet<>();

        OrderToday.add(new Order(1, "chicken", 1, 10.0));
        OrderToday.add(new Order(2,"hamburger", 2,30.0));



























    }
}
