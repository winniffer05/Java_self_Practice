package day11_practice_task;

public class Employee {

    public String name , jobTile ;
    public int age;
    public char gender;
    public double salary;

    public Employee(String name, String jobTile, int age, char gender, double salary) {
        this.name = name;
        this.jobTile = jobTile;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }


    public void work(){
        System.out.println(jobTile+ " "+ name + " is working");

    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTile='" + jobTile + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
/*
3. Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.
 */