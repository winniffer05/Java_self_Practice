package day04_practice_tasks;

public class GradeLevel {

   /*
6. Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:

		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."

			Example:
				   gradeLevel = 8

			Output:
				  Middle school
 */


    public static void main(String[] args) {


        byte number = 8;
        String gradeLevel = " ";

        if (number <= 5) {
            gradeLevel = "Elementary school";

        } else if (number <= 8) {
            gradeLevel = "Middle school";

        } else if (number <= 12) {
            gradeLevel = "High school ";

        } else if (number <= 16) {
            gradeLevel = "College";

        } else {
            gradeLevel = "Grad School";
        }

        System.out.println(gradeLevel);
    }
}