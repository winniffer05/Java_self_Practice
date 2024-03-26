package day16_practice_task;

import java.util.*;

public class CommonElements {

    public static void main(String[] args) {


        List<Integer>list1 = new ArrayList<>(Arrays.asList(10,8,11,20,5,0));
        List<Integer>list2 = new ArrayList<>(Arrays.asList(30,0,20,40,50,10,60));
        Set<Integer>list3= new TreeSet<>();
        for (Integer each:list1){
            for (Integer i :list2){
                if (each==i){
                    list3.add(each);
                }
            }
        }
        System.out.println(list3);





    }
}
/*
3. Create a class named CommonElements and write a program that identifies the common elements in
two given sets of integers and returns a third set containing these common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}
 */