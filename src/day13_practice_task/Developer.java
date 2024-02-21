package day13_practice_task;

public class Developer extends employee{

    private String programmingLanguage;


    public Developer(String name, String gender, int age, String employeeID, String jobTitle, String companyName, double salary) {
        super(name, gender, age, employeeID, jobTitle, companyName, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage() {
        if (this.programmingLanguage ==null){
            System.out.println("Invalid Programming language");
            System.exit(1);
        }

        if (this.programmingLanguage.isBlank()|| this.programmingLanguage.isEmpty()){
            System.out.println("Invalid Programming language");
        }

        this.programmingLanguage = this.programmingLanguage;
    }


    @Override
    public void work() {
        System.out.println("Developer" + "  " +getName() + " "+"is coding in" + getProgrammingLanguage());
    }
}

/*
2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".
 */