package Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SetDemo {
    public static void main(String[] args) {


    CompanyStuff stuff1 = new CompanyStuff("Oleg", 23, "assistant");
    CompanyStuff stuff2 = new CompanyStuff("Taras", 44, "principal");
    CompanyStuff stuff3 = new CompanyStuff("Olga", 32, "secretary");

    System.out.println(stuff1.hashCode());
    System.out.println(stuff1);


    Map<Integer, String> Reparts = new HashMap<>();
    Reparts.put(1, "production");
    Reparts.put(2, "administrative");;
    Reparts.put(3, "financial");




    }
}
