package day7_practice_task;

import java.util.Scanner;


public class GradeReport {


    public static void main(String[] args) {

        Scanner Grade = new Scanner(System.in);
        System.out.println("Enter your score");
        int Score =Grade.nextInt();

        Grade.close();

        if (Score >=100){
            System.out.println("Your garde is : A");
        } else if (Score >= 80) {
            System.out.println("Your grade is: B");

        } else if (Score >=60) {
            System.out.println("Your garde is: C");

        }else {
            System.out.println("Invalid score");
        }


    }

}
/* Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B
             */
