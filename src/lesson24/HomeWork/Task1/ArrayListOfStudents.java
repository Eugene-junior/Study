package HomeWork.Task1;

import java.util.ArrayList;

public class ArrayListOfStudents {
    public static void main(String[] args) {

        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students(0,"Stepan"));
        students.add(new Students(1,"Sofia"));
        students.add(new Students(2,"Olga"));
        students.add(new Students(3,"Alex"));
        students.add(new Students(4,"Dmitry"));

        System.out.println(students.reversed());

        students.remove(4);
        System.out.println(students);;






    }
}
