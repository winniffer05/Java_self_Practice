package day16_practice_task;

import java.awt.font.FontRenderContext;
import java.util.HashSet;
import java.util.Set;

public class Anagram {


    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

        Set<Character>set1 = new HashSet<>();
        for (char c : str1.toCharArray()){
        set1.add(c);

        }
        Set<Character> set2 = new HashSet<>();
        for (char c : str2.toCharArray()){
            set2.add(c);
        }

        boolean results = set1.equals(set2);
        System.out.println(results);



        String str3 = "xyze";
        String str4 = "xyzd";


        Set<Character>set3 = new HashSet<>();
        for (char c : str3.toCharArray()){
            set3.add(c);
        }

        Set<Character> set4 = new HashSet<>();
        for (char c : str4.toCharArray()){
            set4.add(c);
        }

        boolean results1 = set3.equals(set4);
        System.out.println(results1);





    }
}
/*
 Create a class named Anagram and write a program that checks if two strings are anagrams of each other,
 considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false

 */