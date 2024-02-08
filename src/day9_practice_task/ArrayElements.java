package day9_practice_task;

public class ArrayElements {

    public static void main(String[] args) {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array [i]= i+1;
            System.out.println(i);

        }

        System.out.println("--------------");


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }


        System.out.println("------------");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print( array[i] + " ");

        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5==0){
                System.out.println(array[i] + " ");
            }

        }








    }

}
/*
Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
 */