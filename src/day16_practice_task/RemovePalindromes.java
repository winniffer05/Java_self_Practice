package day16_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindromes {




    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static List<String> removePalindromes(List<String> words) {
        List<String> nonPalindromes = new ArrayList<>();
        for (String word : words) {
            if (!isPalindrome(word)) {
                nonPalindromes.add(word);
            }
        }
        return nonPalindromes;
    }

    public static void main(String[] args) {
        List<String> words = List.of("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam");
        List<String> result = removePalindromes(words);
        System.out.println(result);
    }
}









    /*

    public static void main(String[] args) {


        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));








    }
}
/*
 Create a class named RemovePalindromes and write a program that removes all palindrome strings from a given
 list of strings. The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}

 */