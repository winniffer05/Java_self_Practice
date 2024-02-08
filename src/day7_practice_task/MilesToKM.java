package day7_practice_task;

import java.util.Scanner;

import day06_practice_tasks.MaximumAndMini;

public class MilesToKM {

    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles ");
        double miles = input.nextInt();

        double milesToKM = miles* 1.609;

        input.close();

        System.out.println(miles + " is equal to " + milesToKM + " " +"Kilometers");





    }




}


/*
 Create a class named MilesToKM and write a program that asks the user to enter the number of miles and
convert it to kilometers.

        Example:
             Enter the miles:
             Input: 10.0

        Output:
             10.0 miles is equal to 16.09 kilometers
 */