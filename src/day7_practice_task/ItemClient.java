package day7_practice_task;

public class ItemClient {

    public static void main(String[] args) {

        Item item = new Item();

        item.itemName = "cafe";
        item.quantity = 3;
        item.unitPrice = 15.5;
        item.calcCost = (item.quantity* item.unitPrice);


        System.out.println( "Item name: " + item.itemName);
        System.out.println("Item quantity:" + item.quantity);
        System.out.println("Item unit Price: " + item.unitPrice);
        System.out.println("Total cost: " + "$" +item.calcCost);


    }




}
