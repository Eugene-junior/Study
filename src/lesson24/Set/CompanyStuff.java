package Set;

import java.util.Objects;

public class CompanyStuff {

   String name;
   int age;

   String position;

    public CompanyStuff(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyStuff stuff = (CompanyStuff) o;
        return age == stuff.age && Objects.equals(name, stuff.name) && Objects.equals(position, stuff.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, position);
    }

    @Override
    public String toString() {
        return "CompanyStuff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}


