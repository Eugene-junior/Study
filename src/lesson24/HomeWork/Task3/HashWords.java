package HomeWork.Task3;

import java.util.HashMap;
import java.util.Map;

public class HashWords {
    public static void main(String[] args) {



        Map<String,String>WordAndTranslate = new HashMap<>();
        WordAndTranslate.put("Day", "День");
        WordAndTranslate.put("Night", "Ночь");
        WordAndTranslate.put("Evening", "Вечер");
        WordAndTranslate.put("Morning", "Утро");
        WordAndTranslate.put("Sunset", "Закат");

        System.out.println(WordAndTranslate);

        System.out.println(WordAndTranslate.get("Day"));
        System.out.println(WordAndTranslate.get("Sunset"));

        WordAndTranslate.remove("Morning");
        System.out.println("After removal " + WordAndTranslate);

    }
}
