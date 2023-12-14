package dogs;

public class DogDemo {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.voice();

        SmallerDog smallerDog = new SmallerDog();
        smallerDog.voice();
        smallerDog.setName("Rex");
        smallerDog.voice();
        Dog smallerDog1 = new Dog();
        smallerDog1.setName("Kiki");
        smallerDog1.voice();

    }
}
