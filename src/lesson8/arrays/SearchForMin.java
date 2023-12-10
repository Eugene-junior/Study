package arrays;

public class SearchForMin {

public void minSearch(int [] MyArray){
    int min = MyArray[0];
    int indexMin = 0;

    for (int i = 0; i < MyArray.length; i++) {
        if (MyArray[i] < min) {
            min = MyArray[i];
            indexMin = i;
        }
    }

    System.out.println("Minimum is " + min + ", number of index is " + indexMin);

}
}