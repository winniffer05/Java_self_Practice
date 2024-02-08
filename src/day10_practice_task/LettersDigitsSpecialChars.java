package day10_practice_task;

public class LettersDigitsSpecialChars {


    public static void main(String[] args) {

        String str = "WINNIFFER0506DILUYO!";

        String digit = "";
        String letters = "";
        String specialCharacters = "";



        for (char each : str.toCharArray()){

            if (Character.isDigit(each)){
                digit += each;


            } else if (Character.isLetter(each)) {
                letters += each;

            }else {
                specialCharacters += each;
            }



        }


        System.out.println("letters:" + letters);
        System.out.println("Digital:"+ digit);
        System.out.println("SpecialCharacters:"+ specialCharacters);



    }


}


/*
1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";

 */