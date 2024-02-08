package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {



    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,1,2,3,4,5,5));

        ArrayList<Integer> results = new ArrayList<>();

        for (Integer each : nums){
            if (!results.contains(each)){
                results.add(each);
            }
        }
        System.out.println(results);





    }


}
/*
Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]
 */