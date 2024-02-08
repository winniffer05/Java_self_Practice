package day9_practice_task;

public class ReverseArray {

    public static void main(String[] args) {


        int[] array = {1,2,3,4,5};


        for (int i = array.length - 1; i >= 0; i--) {
          int  resulst=  array[i] ;

            System.out.print(array[i]+" ");



        }






    }


}
/*
 Create a class named ReverseArray and write a program to reverse an array of integers and return it as a new one.

			Example:
				array = {1,2,3,4,5};

			Output:
				reversedArray = {5,4,3,2,1};
 */