package day11_practice_task;

public class CydeoStudentClients {

    public static void main(String[] args) {

        CydeoStudent.schoolName = "Cydeo School Name";
        CydeoStudent.programmingLanguage= "Java";

        CydeoStudent cydeoStudent1 = new CydeoStudent("luis",20,2302,'B',22,1);
        CydeoStudent cydeoStudent2 = new CydeoStudent("Patricia",30,402,'B',25,1);

        cydeoStudent2.Study();
        cydeoStudent1.AttendanceClass();
        CydeoStudent.SchoolName();
        CydeoStudent.programmingLanguage();

        System.out.println(cydeoStudent1);
        System.out.println(cydeoStudent2);



    }
}
