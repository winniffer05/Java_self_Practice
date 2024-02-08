package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MoveTheZeros {

    public static void main(String[] args) {



        ArrayList<Integer> zeros = new ArrayList<>( Arrays.asList(1,2,0,0,5,0,6));

        int countZeros = Collections.frequency(zeros , 0);

        zeros.removeAll(Arrays.asList(0));

        for (int i = 0; i < countZeros; i++) {
            zeros.add(0);

        }





        System.out.println(zeros);
















    }
}
/*

5. Create a class called MoveTheZeros and write a program with the following specifications:
   5.1 Given an ArrayList, move all zeros to the last indexes of the ArrayList.

	            Example:
	                list: {1,0,2,0,3,0,4,0}

	            output:
	                [1, 2, 3, 4, 0, 0, 0, 0]

 */