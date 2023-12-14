package dogs;

public class SmallerDog extends Dog {
private String name;



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice(){
        System.out.println("Small dog " + getName() + " barking");
    }
}
