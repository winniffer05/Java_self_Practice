package day7_practice_task;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int Radius = input.nextInt();

        double Pi = 3.14;

        input.close();


        System.out.println("The area of the circle is : " + (Pi*Radius*Radius));
        System.out.println("The perimeter of the circle is: "+ (2*Pi*Radius));




    }

}


 /*6. Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4 */