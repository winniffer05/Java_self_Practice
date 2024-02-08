package day7_practice_task;

import java.util.Scanner;


public class FamilyMembers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people live with you?");
        int FamilyMember = input.nextInt();

        if (FamilyMember<3){
            System.out.println("Live with less than 3 people");
        } else if (FamilyMember > 3 && FamilyMember <6) {
            System.out.println("Live with more them 6 people.");

        }else {
            System.out.println("Live with more than 6 people.");
        }



        input.close();


    }








}





/*Create a class named FamilyMembers and write a program that asks the user how many people they live with.

    If the user lives with fewer than three people, print "Live with less than three people."
    If the user lives with 3 - 6 people, print "Live with 3 - 6 people."
    If the user lives with more than six people, print "Live with more than six people."

        Example:
             How many people do you live with?
             Input: 3

        Output:
             Live with 3 - 6 people.
             */
