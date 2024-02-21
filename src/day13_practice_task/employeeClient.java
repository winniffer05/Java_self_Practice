package day13_practice_task;

public class employeeClient {

    public static void main(String[] args) {


        tester tester = new tester("Jose","M",34,"12bb","SDET","Cydeo",2500);
        Developer developer= new Developer("Winniffer","Female",28,"AB123","Senior Enginner","Tesla",6500);
        Driver driver = new Driver("Albert","M",19,"BB202","Driver","uber",2500);

        tester.work();
        driver.work();

        System.out.println(tester);




    }
}
