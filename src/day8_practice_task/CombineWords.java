package day8_practice_task;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner inputWord = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1 = inputWord.next();
        System.out.println("Enter second word");
        String word2 = inputWord.next();


        if (word1.charAt(word1.length() -1)== word2.length()-1){
            word2 = word2.substring(1);
            System.out.println(word1+word2);
        }else {
            System.out.println(word1+word2);
        }



    }


}
/*
3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight

 */