package day16_practice_task;

import day10_practice_task.RemoveDuplicates;

import java.util.*;

public class mergeList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70));
        List<Integer>list1=new ArrayList<>(Arrays.asList(30,40,50,60,70,80,90,100));
        Queue<Integer>list2 = new PriorityQueue<>();
        list2.addAll(list);
        list2.addAll(list1);
        new removeDuplicates(list2);

        System.out.println(list2);





    }
}
/*
 Create a class named MergeLists and write a program that merges two given
  lists of integers into a third list. Ensure that the third list contains no duplicate elements and
  maintains the original order of elements from the input lists.

         Example:
            list1 = {10, 20, 30, 40, 50, 60, 70}
            list2 = {30, 40, 50, 60, 70, 80, 90, 100}

         Output:
            list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
 */