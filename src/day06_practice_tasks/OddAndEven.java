package day06_practice_tasks;

public class OddAndEven {

    public static void main(String[] args) {

boolean results =  isOdd(1);
        System.out.print(results );

        results = isEven(57);

    }

    public static boolean isOdd (int num1){
        if (num1 % 2==1){
            return (true);
        }else {
            return false;
        }

    }

     public static boolean isEven (int num2){

        if (num2 %2==0){
            return (true);
        }else {
            return false;
        }

}



}
