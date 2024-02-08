package day04_practice_tasks;

public class monthName {

/*
11. Create a class named MonthName. Given an integer variable named number representing the number
of the month, write a program that displays the month's name based on the given number.

			Example 1:
				     number = 10

			Output:
				  October

			Example 2:
				     number = -20

			Output:
				  No such a month
 */


    public static void main(String[] args) {

        int number = 10;
        String results = " ";

        switch (number){

            case 1:
                results = "January";
                break;
            case 2:
                results = "February";
                break;
            case 3:
                results = " March ";
                break;
            case 4:
                results = " April";
                break;
            case 5:
                results = "May";
                break;
            case 6 :
                results = "June";
                break;
            case 7 :
                results = "July";
                break;
            case 8 :
                results =" Agoust";
                break;
            case 9 :
                results = "September";
                break;
            case 10 :
                results = "October";
                break;
            case 11:
                results = "November";
                break;
            case 12 :
                results = "December";
                break;

            default:
        }

        System.out.println(results);

    }
}
