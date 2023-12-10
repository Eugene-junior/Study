package homeTasks;

public class Method {
    public static void Invert (String [] stringArray){
        for (int i = 0; i < stringArray.length/2; i++) {
            String temporary = stringArray[i];
            stringArray[i] = stringArray[stringArray.length - i - 1];
            stringArray[stringArray.length - i - 1] = temporary;

        }



    }
}
