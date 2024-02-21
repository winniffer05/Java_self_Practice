package day13_practice_task;

public class Driver extends employee {


    public Driver(String name, String gender, int age, String employeeID, String jobTitle, String companyName, double salary) {
        super(name, gender, age, employeeID, jobTitle, companyName, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ "  "+"is driving");
    }
}
/*
 Driver:
       - work(): Displays "[name] is driving"
 */