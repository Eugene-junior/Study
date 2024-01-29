package homework.Task4;

import java.util.HashMap;
import java.util.Map;

public class PhoneHashMapDemo {
    public static void main(String[] args) {

        Map<String, String> PhoneList = new HashMap<>();
        PhoneList.put("2585525", "Friedman");
        PhoneList.put("2000075", "Bergman");
        PhoneList.put("2779033", "Goldman");
        PhoneList.put("4445558", "Freeman");
        PhoneList.put("7700255", "Zilberman");
        System.out.println(PhoneList);
        System.out.println(PhoneList.get("2000075"));



    }
}
