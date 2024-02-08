package day9_practice_task;

import java.lang.reflect.Array;
import java.util.Arrays;

public class evenOddNumbers {

    public static void main(String[] args) {

        int[] evenOdd = {1,2,3,4,5,6,7};

        int evenNums = 0;
        int oddNums = 0;

        for (int i = 0; i < evenOdd.length; i++) {
            if (evenOdd[i] % 2 ==0){
                evenNums++;

            }else {
                oddNums++;


            }

        }

        System.out.println("the array have" +" " +evenNums + " "+ "even numbers and "+oddNums +" "+ "odd numbers");
    }
}
/*
Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.
 */