package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,6,7,8,9));

        numbers.addAll(Arrays.asList(5,6,7,8,9));

        System.out.println(numbers);



    }


}
/*
Create a class called DuplicateElements and write a program with the following specifications:
   3.1 Given an ArrayList, duplicate each element in the list.

		 	Example:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
 */