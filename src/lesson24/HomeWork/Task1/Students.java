package HomeWork.Task1;

public class Students {

    Integer id;
    String Name;

    public Students(Integer id, String name) {
        this.id = id;
        Name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
