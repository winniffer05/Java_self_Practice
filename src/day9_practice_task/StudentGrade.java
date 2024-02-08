package day9_practice_task;

public class StudentGrade {

    public static void main(String[] args) {


        String[] studentName = {"Luara", "Maria", "Jose",};
        int[] score ={90,70, 50};
        char[] grade = new char[ studentName.length ];


        for (int i = 0; i < studentName.length; i++) {

             int scores = score[i];

             if (scores >=90){
                 grade[i] = 'A';
             } else if (scores >= 70) {
                 grade[i]= 'B';

             }else{
                 grade[i]= 'C';
             }

            System.out.println(studentName[i] + " Score is " + score[i] + "and grade is " + grade[i]);


        }



    }
}
/*
 Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
 */