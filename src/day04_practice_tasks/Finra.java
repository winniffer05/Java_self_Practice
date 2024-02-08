package day04_practice_tasks;

public class Finra {

    public static void main(String[] args) {


        int num = 15;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FINRA");
        } else if (num % 3 == 0) {
            System.out.println("FIN");
        } else if (num % 5 == 0) {
            System.out.println("RA");
        }

        System.out.println(num);
    }


        }
