package people;

public class PersonTest {
    public static void main(String[] args) {


        Person person = new Person();
        person.setName("Jonh Johnson");
        person.setAge(32);

        String personName = person.getname();
        int personAge = person.getAge();

        System.out.println("His name is " + personName);
        System.out.println("His age is " + personAge);


    }

}