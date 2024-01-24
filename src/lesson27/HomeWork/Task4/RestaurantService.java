package HomeWork.Task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RestaurantService {
    List<Order>OrderList = new ArrayList<>();
    List<String> Menu = new ArrayList<>();
    public List MakeMenu(){
        Menu.add(0,"chicken");
        Menu.add(1,"meat");
        Menu.add(2,"fish");
        Menu.add(3,"pizza");
        Menu.add(4,"salad");
        Menu.add(5,"hamburger");
        System.out.println("Menu for today: " + Menu);
        return Menu;
    }


    public List<String> MakeOrder(Order dishName){
        Order newDish = dishName;
        System.out.println(newDish + " is ordered");
        return new ArrayList<>();

        }


    }


