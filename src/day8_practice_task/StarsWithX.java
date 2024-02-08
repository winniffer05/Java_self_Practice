package day8_practice_task;

import java.util.Scanner;

public class StarsWithX {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word1 = input.next();

        if (word1.charAt(0)=='x'){
            word1 = word1.replaceFirst("x","a");
            System.out.println(word1);
            return;
        }
        System.out.println(word1);










    }


}
/*
1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex

 */