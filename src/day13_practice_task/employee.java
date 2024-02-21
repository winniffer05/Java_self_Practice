package day13_practice_task;

public class employee extends Person{


    private String employeeID,jobTitle,companyName;
    private double salary;


    public employee(String name, String gender, int age, String employeeID, String jobTitle, String companyName, double salary) {
        super(name, gender, age);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <=0 ){
            System.err.println("Invalid Salary");
            System.exit(1);
        }
        this.salary = salary;
    }



    public void work(){
        System.out.println(getJobTitle() + "" + getName() );
    }

    @Override
    public String toString() {
        return "employee{" +
                "employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
2. Create a subclass of Person named "Employee" with the following specifications:
   Attributes:
       - employeeId: String
       - jobTitle: String
       - salary: double
       - companyName: String

   Encapsulation All the fields.
       Condition:
            Salary can not be zero orn egative

   Add a constructor to initialize all fields.

   Methods:
       - work(): Displays the employee's job title and name.
       - toString(): Returns a string representation of the Employee object.
 */