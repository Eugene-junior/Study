package arrays;

public class SearchForMax
{

public void maxSearch (int [] MyArray){



    int max = MyArray[0];
    int indexMax = 0;
    

    for (int i = 0; i < MyArray.length; i++){
        if (MyArray[i] > max){
            max = MyArray[i];
            indexMax = i;
        }

    }

    System.out.println("Maximum is " + max + ", number of index is " + indexMax);
} 



}
