package day13_practice_task;

public class teacher extends  employee{

    public teacher(String name, String gender, int age, String employeeID, String jobTitle, String companyName, double salary) {
        super(name, gender, age, employeeID, jobTitle, companyName, salary);
    }


    @Override
    public void work() {
        System.out.println(getName() + "is teaching");
    }
}
/*
Teacher:
       - work(): Displays "[name] is teaching".
 */