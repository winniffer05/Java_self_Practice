package day7_practice_task;

public class Employee {
/*
CUSTOM CLASS TASKS:
1. Create a class named Employee with the following attributes and actions:

      Attributes:
            name (String): used for storing the name of the employee
            age (int): used for storing the age of the employee
            gender (char): used for storing the gender of the employee
            jobTitle (String): used for storing the job title of the employee
            salary (double): used for storing the job title

      Actions:
            work(): plays the job title and name of the employee concatenated with " is working."

            toString(): returns a string representation of the employee object.

      Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.


 */

    public static void main(String[] args) {

    }
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void work ( ){
        System.out.println(name + " is working");
        System.out.println(jobTitle + " is working ");










    }


}
