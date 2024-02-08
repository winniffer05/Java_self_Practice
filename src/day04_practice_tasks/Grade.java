package day04_practice_tasks;

public class Grade {

    /*
5. Create a class called Grade. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				  Great job

 */

    public static void main(String[] args) {

        char grade = 'A';


        boolean validGrade = (grade >= 'A' && grade <= 'D' || grade == 'F');

        String results;

        if (validGrade) ;

        if (grade == 'A') {
            results = "Excelent";

        } else if (grade == 'B') {
            results = "Gread Job";

        } else if (grade == 'C') {
            results = "Good";

        } else if (grade == 'D') {
            results = "Passed";

        } else {
            results = "Failed";
        }


        System.out.println(results);
    }

}
