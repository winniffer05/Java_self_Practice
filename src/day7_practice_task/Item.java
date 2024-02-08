package day7_practice_task;

public class Item {

    public String itemName;
    public double unitPrice;
    public int quantity;

    public double calcCost;


    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }

    public void calcCost(){
        System.out.println(unitPrice *quantity);




    }







}
