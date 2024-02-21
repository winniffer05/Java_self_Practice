package day11_practice_task;

public class CydeoStudent {

    public String name;
    public  int age;
    public int ID;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String programmingLanguage;

    public CydeoStudent(String name, int age, int ID, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }


    public void Study(){
        System.out.println(name +"" + "is studyng");

    }

    public void AttendanceClass(){
        System.out.println(name + " "+ "is attending the live class");
    }

    public static void SchoolName(){
        System.out.println(schoolName );

    }

    public static void programmingLanguage(){
        System.out.println(programmingLanguage);
    }


    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }


}
