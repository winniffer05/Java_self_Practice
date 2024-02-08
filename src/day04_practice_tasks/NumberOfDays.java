package day04_practice_tasks;

public class NumberOfDays {

/*
12. Create a class named NumberOfDays. An integer variable named month is given.
	Write a program to determine the number of days in a given month.

			Example:
				   month = 5

			Output:
				   31 days

			(Assume that February has 28 days)

		If the given month number is not between 1~12, then print "Invalid."

		Hints:
			Months with 31 days: 1, 3, 5, 7, 8, 10, 12
			Months with 30 days: 4, 6, 9, 11
 */

    public static void main(String[] args) {



        int month = 1;


        switch (month){

            case 2:
                System.out.println(" 28 days");
                break;
            case 1,3,5,7,8,10,12:
                System.out.println("31 days");
                break;
            case 4, 6, 9 , 11 :
                System.out.println("31 days");
                break;
            default:
                System.out.println("invalid month");


        }

        System.out.println(month);

    }

}
