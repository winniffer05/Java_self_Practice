package day04_practice_tasks;

public class ChooseLanguage {

    public static void main(String[] args) {

/* for 1: Hello, thank you for your call
		for 2: Hola, gracias por llamar
		for 3: Merhaba, aradığınız için teşekkürler
		for 4: Привет, спасибо за ваш звонок
		for 5: Merci, pour votre appel

 */

        int selection = 2;

        if (selection == 1) {
            System.out.println("Hello, thank you for your call");
        } else if (selection == 2) {
            System.out.println("Hola, gracias por llamar");

        } else if (selection == 3) {
            System.out.println("Merhaba, aradığınız için teşekkürler");
        } else if (selection == 4) {
            System.out.println("Привет, спасибо за ваш звонок");

        } else if (selection == 5) {
            System.out.println(" Merci, pour votre appel");

            System.out.println(selection == 2);
        }



    }
}

/*
Paste the requiremnt here
 */