package homework;

import java.util.Scanner;

public class WorkWithTrueOrFalse {

 public static void main(String[] args) {

int x;
int y;

Scanner scanner = new Scanner(System.in);
  System.out.println("please enter your age of Yevhen ");
 x = scanner.nextInt();
  System.out.println("please enter your age of Alex ");
  y = scanner.nextInt();

 if (x > y) {
  System.out.println("Yevhen is older than Alex");
 }
 else {
  System.out.println("Alex is older than Yevhen");
 }

 boolean ageCompare = (y > x);
  System.out.println(ageCompare);



}
}