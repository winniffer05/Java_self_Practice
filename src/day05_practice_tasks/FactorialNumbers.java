package day05_practice_tasks;

public class FactorialNumbers {
/*
5. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */




    public static void main(String[] args) {


        int num = 5;

        long result = 1;


        for (int i = num; i >= 1 ; i--){
            result *= i;
        }

        System.out.println( " results = "+ result);



    }

}
