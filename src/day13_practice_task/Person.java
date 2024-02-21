package day13_practice_task;

public class Person {

    private String Name,Gender;
    private int age;


    public String getName() {
        return Name;
    }

    public void setName(String name) {

        if (name==null){
            System.out.println("Invalid Name");
            System.exit(1);
        }
        if (name.isBlank()||name.isEmpty()){
            System.out.println("Invalid Name");
            System.exit(1);
        }
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        if (gender==null){
            System.out.println("Invalid Gender");
            System.exit(1);
        }
        if (gender.isEmpty()||gender.isBlank()){
            System.out.println("Invalid Gender");
            System.exit(1);
        }
        Gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <=0){
            System.out.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public Person(String name, String gender, int age) {
        Name = name;
        Gender = gender;
        this.age = age;
    }


    public void eat(){
        System.out.println(Name + "is eating");
    }

    public void Sleep(){
        System.out.println(Name + "is sleeping");
    }


    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
Employee Task Requirements:
1. Create a class named "Person" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: String

   Encapsulation All the fields.
        Conditions:
            Name can not be set to null or empty
            Age can not be set to zero or negative

   Add a constructor to initialize all fields.

   Actions:
       - eat(): Displays the person's name with the message " is eating"
       - sleep(): Displays the person's name with the message " is sleeping"
       - toString(): Returns a string representation of the Person object.

 */