package day8_practice_task;

import java.util.Scanner;


public class WithoutFirstChar {


    /*2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
         String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();
        System.out.println(word1.substring(1) + " " +word2.substring(1));





    }

}
