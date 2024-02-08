package day9_practice_task;

import java.util.Arrays;

public class items {


    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =  {12345 ,     12346,  12347,    12348,     12349,    12350};


        int indexItem = 0;
        boolean itemIpad = false;
        String report = "";



        for (int i = 0; i < items.length; i++) {

            String itemsName = items[i];
            double itemsPrice = prices[i];
            int AllItemsID= itemIDs[i];
            report = items[i] + " " +prices[i] + " " +itemIDs[i];


            if (itemsName.equals("Gloves")){
                indexItem = i;
                System.out.println( "the index of Gloves is : " + indexItem);

                
            } if(itemsName.equals("iPad")) {
                itemIpad = true;
                System.out.println( "IPad is one of the item : " + itemIpad);


                System.out.println(report);
            }



            System.out.println(report);




        }










    }



}
/*

5. 5. Create a class named Items and write a program with the following specifications:
	5.1 Given arrays with the same length:
		String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
		double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
		int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

   5.2 Find the first index number of "Gloves".
   5.3 Check if "iPad" is contained in the item list.
   5.4 Print the report for each shopping item in the format:
   				name - price - #ID
 */