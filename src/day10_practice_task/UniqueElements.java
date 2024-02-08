package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10,10,20,30,40,40,50,50));
        ArrayList<Integer> unique = new ArrayList<>(num);

        unique.removeIf(p -> Collections.frequency(num,p) > 1);
        System.out.println(unique);



    }


}
/*
 Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]
 */