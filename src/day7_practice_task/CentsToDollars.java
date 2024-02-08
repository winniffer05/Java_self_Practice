package day7_practice_task;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {


        Scanner Cents = new Scanner(System.in);
        System.out.println("Enter the number of cents");
        double cents = Cents.nextDouble();
        double Dollar = 100;

        Cents.close();

        System.out.println( "225 cents is equal to "  +   (cents / Dollar) + " " + "dollar");









    }
}


/*
8. Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents
 */