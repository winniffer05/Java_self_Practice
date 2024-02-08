package day05_practice_tasks;

public class Triangle {

    /*
7. Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
 */





    public static void main(String[] args) {


        System.out.println("*\n" +
                "\t\t\t\t* *\n" +
                "\t\t\t\t* * *\n" +
                "\t\t\t\t* * * *\n" +
                "\t\t\t\t* * * * *\n" +
                "\t\t\t\t* * * * * *\n" +
                "\t\t\t\t* * * * * * *\n" +
                "\t\t\t\t* * * * * * * *\n" +
                "\t\t\t\t* * * * * * * * *\n" +
                "\t\t\t\t* * * * * * * * * *");

        System.out.println();

        System.out.println("------------------------------------");

        for (int i = 0; i <10; i ++){
            System.out.print("\t\t\t\t");
            for (int j = 0; j <= i; j++ ){
                System.out.print("* ");
            }

            System.out.println();
        }



    }

}
