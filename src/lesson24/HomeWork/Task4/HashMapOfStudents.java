package HomeWork.Task4;

import java.util.*;

public class HashMapOfStudents {
    public static void main(String[] args) {

        HashMap<String, Students> MapStudent = new HashMap<>();

        Students students1 = new Students("Oleg",4.75);
        MapStudent.put(students1.getName(), students1);

        Students students2 = new Students("Helen",4.5);
        MapStudent.put(students2.getName(), students2);

        Students students3 = new Students("Roman",4.4);
        MapStudent.put(students3.getName(), students3);

        Students students4 = new Students("Nick",3.9);
        MapStudent.put(students4.getName(), students4);

        Students students5 = new Students("Olga",4.1);
        MapStudent.put(students5.getName(), students5);
        System.out.println(MapStudent);

        List<Students>sortedByRange = new ArrayList<>(MapStudent.values());
        Collections.sort(sortedByRange);
        System.out.println(sortedByRange);




        













        }


    }

