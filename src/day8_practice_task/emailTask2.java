package day8_practice_task;

import java.util.Locale;
import java.util.Scanner;

public class emailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your email address");
        String email = input.next();

        if (email.contains("_")){
            String firstPart = email.substring(0,email.indexOf("_"));
            String SecondPart = email.substring(email.indexOf("_")+ 1, email.indexOf("@"));
            String domainPart = email.substring(email.indexOf("@"));

            System.out.println( "First name :"  + firstPart.substring(0, 1).toUpperCase() + firstPart.substring(1).toLowerCase());
            System.out.println( "Last name " + SecondPart.substring(0, 1).toUpperCase() + SecondPart.substring(1).toLowerCase());
            System.out.println("Domain : " +  domainPart.substring(0, 1).toUpperCase() + domainPart.substring(1).toLowerCase());







        }









    }


}
