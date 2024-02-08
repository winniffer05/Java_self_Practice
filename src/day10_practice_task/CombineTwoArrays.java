package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {


    public static void main(String[] args) {

        String[] arr1 ={"A", "B","C"};
        String[] arr2 = {"D","E","F","G"};


        ArrayList<String> arr3 = new ArrayList<>(Arrays.asList());

        for (String each : arr1){
            arr3.add(each);
        }

        for (String each :arr2){
            arr3.add(each);
        }

        System.out.println(arr3);

    }



}
/*
 Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */