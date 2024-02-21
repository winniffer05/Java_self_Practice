package day12_practice_task;

public class ItemClient {
    public static void main(String[] args) {

        Item item = new Item(0,2,"");
        Item item1 = new Item(5,4,"*");

        item1.calcCost();
        item.calcCost();


        System.out.println(item1);
        System.out.println(item1.calcCost());

        System.out.println("---------");

        System.out.println(item);
        System.out.println(item.calcCost());




    }

}
