package day11_practice_task;

public class EmployeeClient {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Josh","chef",23,'f',20);

        Employee employee2 = new Employee("Maria","cleaner",30,'F',40);


        employee2.work();
        employee1.work();

        System.out.println(employee2);

    }
}
