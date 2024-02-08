package day9_practice_task;

public class ClassMateInitials {

    public static void main(String[] args) {


        String[] ClassMate = { "Maria Lopez", "Jose Contreras" , " Patricia Farfan" , "Williams Cardenas", "Parker Bake" ,
                "Antono Palacios" , "Fabiola Hernandez" , "Albert Perez", "Laura Maria","Pedro Peroza"  };

        for (int i = 0; i < ClassMate.length; i++) {

            String initials = ClassMate[i].charAt(0) + "."+ ClassMate[i].charAt(  ClassMate[i].indexOf(" ") + 1 );
            System.out.println(initials);

        }








    }
}
/*
Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */