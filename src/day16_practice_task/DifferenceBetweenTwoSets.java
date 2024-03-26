package day16_practice_task;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DifferenceBetweenTwoSets {
    public static void main(String[] args) {


        Set<Integer>list1 = new TreeSet<>(Arrays.asList(1,2,3,5));
        Set<Integer>list2 = new TreeSet<>(Arrays.asList(2,3,4));


        Set<Integer>list3 = new HashSet<>();
        list3.addAll(list1);
        list3.addAll(list2);
        list3.removeAll(list2);
        System.out.println(list3);



    }



}
/*
Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of
integers (elements in the first set but not in the second) and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}

 */