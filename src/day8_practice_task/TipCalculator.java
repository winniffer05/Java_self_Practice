package day8_practice_task;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)");
        String split = input.next();
        System.out.println("Enter the number of people (number)");
        int numberOfPeople= input.nextInt();
        System.out.println("Enter the check amount (number)");
        int amount = input.nextInt();
        System.out.println("Service Quality?: Poor, Fair, Good , Great , Excellent" );
        String quality = input.next();

        double totalTip = 0;

        if (quality.equals("Poor")) {
            totalTip = amount * 0.05;
        } else if (quality.equals("Fair")) {
            totalTip = amount * 0.10;
        } else if (quality.equals("Good")) {
            totalTip = amount * 0.15;
        } else if (quality.equals("Great")) {
            totalTip = amount * 0.20;

        } else if (quality.equals("Excellent")) {
            totalTip = amount * 0.25;
        }

        double totalpay = amount +totalTip;
        double totalPorPerson = totalpay / numberOfPeople;
        double  tipPerPerson = totalTip / numberOfPeople;

        System.out.println("Number of people entered:" + numberOfPeople);
        System.out.println("Total to pay:" + totalpay);
        System.out.println("Total tip:" + totalTip);
        System.out.println("total por person: " + (totalpay/4)+tipPerPerson);
        System.out.println("Tip per person:" +tipPerPerson );





    }

}
/*

7. Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75

 */