package string;

public class StringExample {

    public static void main(String[] args) {

        String text1 = "This is string text example";

        String text2 = "This is string text example";

        String text3 = new String("This is string text example");


        System.out.println(text1 == text2);

        System.out.println(text2 == text3);

        System.out.println("-------------------");

        System.out.println(text1.equals(text2));

        System.out.println(text2.equals(text3));


        char symbol1 = text1.charAt(22);
        System.out.println(symbol1);

        String mySubString = text1.substring(1,7);
        System.out.println(mySubString);

        // превращение в большие буквы и в маленькие буквы

        String textAfterUpperCase = text1.toUpperCase();
        System.out.println(textAfterUpperCase);

        String textAfterLowerCase = text3.toLowerCase();
        System.out.println(textAfterLowerCase);

        // поиск места слова в тексте

        System.out.println(text1.indexOf("ing"));

        System.out.println(text1.indexOf(" ing"));

        //смена букв в предложении

        String replacedText = text1.replaceAll("i", "e");
        System.out.println(replacedText);


    }










}
