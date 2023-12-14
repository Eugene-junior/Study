package inheritance;

public class PersonZodiac extends Person {
    private String Zodiac;


    public PersonZodiac(String name, String surName, int age, String Zodiac) {
        super(name, surName, age);
        this.Zodiac = Zodiac;

    }

    @Override
    public String toString() {
        return "PersonZodiac{" + super.toString() +
                " Zodiac='" + Zodiac + '\'' +
                '}';
    }

}

