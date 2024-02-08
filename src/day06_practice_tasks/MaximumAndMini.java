package day06_practice_tasks;

public class MaximumAndMini {

    public static void main(String[] args) {

        int maxInt = max( 24,30);
        System.out.println(maxInt);

        double maxDouble = max(15.3,40.2);
        System.out.println(maxDouble);

        int minInt =min(9,5);
        System.out.println(minInt);

        double minDouble = min(3.4,6.2);
        System.out.println(minDouble);
    }



    public static int max (int num1, int num2 ){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

public static double max (double num1, double num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;

        }
}

public static int min (int num1, int num2){
        if (num1<num2){
            return num1;
        }else {
            return num2;
        }
}

public static double min(double num1 , double num2){
        if (num1<num1){
            return num1;
        }else {
            return num2;
        }
}

}
