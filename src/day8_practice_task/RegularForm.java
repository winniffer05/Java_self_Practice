package day8_practice_task;

import java.util.Scanner;

public class RegularForm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name ");
        String firstname = input.next();
        System.out.println("Enter last name");
        String lastname = input.next();


        System.out.println( "First name :"  + firstname.substring(0,1).toUpperCase() + firstname.substring(1,5).toLowerCase() );
        System.out.println("last name: " +lastname.substring(0,1).toUpperCase() + lastname.substring(1,6).toLowerCase());












    }


}
/*
. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School

 */