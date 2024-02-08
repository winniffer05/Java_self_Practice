package day7_practice_task;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee0 = new Employee();
        employee0.name = "Winniffer";
        employee0.age = 28;
        employee0.gender = 'f';
        employee0.salary = 2_000;
        employee0.jobTitle = "SDET";

        Employee employee1 = new Employee();

        employee1.name = "Winniffer";
        employee1.age = 24;
        employee1.gender = 'f';
        employee1.jobTitle = "SDET";
        employee1.salary = 8_000;

        System.out.println( "Name : " + employee1.name);
        System.out.println("Age : " + employee1.age);
        System.out.println("Gender:" + employee1.gender);
        System.out.println("Job Tittle: " + employee1.jobTitle);
        System.out.println("Salary: " + "$"+ employee1.salary);








    }


}
