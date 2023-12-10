package homeTasks.Array;

public class Average {

    public int Average (int [] WorkingArray){
        int Average = 0;
        int sum = 0;
        for (int i = 0; i < WorkingArray.length; i++) {
            sum = sum + WorkingArray[i];
        }
        Average = sum/2;
        System.out.println("Average of array " + " is " + Average);

        return Average;
    }
}
