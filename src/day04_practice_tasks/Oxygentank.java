package day04_practice_tasks;

public class Oxygentank {

    public static void main(String[] args) {

        /*Above 90 - Your tank is full
		Above 80 - Still okay
		Above 70 - Don't go too far
		Above 60 - Start to head back
		Above 50 - Be careful, you're at 50%


         */


        int select = 75;


        if (select == 90) {
            System.out.println("Your tank is full");
        } else if (select >= 80) {
            System.out.println("Still okay");
        } else if (select >= 70) {
            System.out.println("Don't go too far");
        } else if (select >= 60) {
            System.out.println("Start to head back");
        } else if (select >= 50) {
            System.out.println("Be careful, you're at 50%");
        }

        System.out.println(select);
    }
}
