package inheritance;

public class PersonDemo {
    public static void main(String[] args) {

     Person person = new Person("Yevhen","Panasenko", 44);
     person.getDataPerson(person);

     person.setSurName("Ivanov");
     person.getDataPerson(person);

     PersonZodiac personZodiac = new PersonZodiac("Olga", "Trofimenko", 35, "Pisces");
     personZodiac.getDataPerson(personZodiac);





    }
}
