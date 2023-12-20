package homework;

abstract class Shape {
    private String name;


    public Shape(String name) {
        this.name = name;
    }

    public double CalculatorSquare (){return 0;

    };
    public double CalculatorPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
