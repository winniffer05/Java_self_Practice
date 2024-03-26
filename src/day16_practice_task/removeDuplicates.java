package day16_practice_task;

import java.util.Arrays;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class removeDuplicates {

    public removeDuplicates(Queue<Integer> list2) {
    }

    public static void main(String[] args) {

        Set<Integer>set = new TreeSet<>(Arrays.asList(20,15,10,20,30,10,20,15,0));
        System.out.println(set);




    }

}
/*
1. Create a class named RemoveDuplicates and write a program that takes a list of integers, removes any
duplicate values, and returns the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}
 */