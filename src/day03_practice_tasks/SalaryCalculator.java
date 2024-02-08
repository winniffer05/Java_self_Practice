package day03_practice_tasks;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;


        double grossPaySalary = (weeklyHours * hourlyRate) * 52;
        double federalTax = (grossPaySalary * federalTaxRate) / 100;
        double stateTax = (grossPaySalary * stateTaxRate) /100;
        double totalTax = (stateTax + federalTax );
        double netIncome = (grossPaySalary - totalTax);

        System.out.println("Gross pay is :" + grossPaySalary);
        System.out.println("Federal Tax is:" + federalTax);
        System.out.println("State tax is: " + stateTax);
        System.out.println("Total tax is: " +totalTax);
        System.out.println("Net income is: " + netIncome );






    }
}
