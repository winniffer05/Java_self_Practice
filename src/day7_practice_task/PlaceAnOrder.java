package day7_practice_task;

import java.util.Scanner;


public class PlaceAnOrder {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name");
        String product = input.next();

        System.out.println(" Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        System.out.println("enter their first name");
        String name = input.next();


        System.out.println(name + " " + "Your order for " + quantity + " " +product+ " " + "has been placed. Your total is : "
                +"$" + price*quantity );





    }

}
/*
10. Create a class named PlaceAnOrder:

    Ask the user to enter the product name (multiple words).
    Ask the user to enter the price (double).
    Ask the user to enter the quantity (int).
    Ask the user to enter their first name (String, single word).

    Print in the following format:

        Example:
             Inputs: "Apples", 1.5, 5, "Luke"

        Output:
             Luke, your order for 5 Apples has been placed. Your total is 7.5.

 */