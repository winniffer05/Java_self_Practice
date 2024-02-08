package day9_practice_task;
import java.util.Arrays;
public class ClassMatesReversed {

    public static void main(String[] args) {


        String[] classmates = {"Maria Laura", "Apple Pay", "Lopez Juan", "Luis Jose", "Ihor Bond"
                , "Laura Herrera", "Pedra lopez", "Albert Jose", "Lamp Luis", "Team Pie"};

        String[] resulst = reverse(classmates);

        System.out.println(Arrays.toString(resulst));

    }
    public static String[] reverse(String[] array) {

        String[] reversearray = new String[array.length];

        for (int i = array.length - 1, j= 0; i >= 0; i--, j++) {
            reversearray [j] = array[i];
        }
        return reversearray;


    }





}
/*

6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */