package day8_practice_task;
import java.util.Scanner;


public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = input.next();

        if (email.contains("_")){
            String firstPart = email.substring(0,email.indexOf("_"));
            String SecondPart = email.substring(email.indexOf("_")+ 1, email.indexOf("@"));
            String domainPart = email.substring(email.indexOf("@"));
            System.out.println(SecondPart + firstPart + domainPart);

        }else {
            System.out.println(email);
        }


    }


}
/*
. Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com

 */