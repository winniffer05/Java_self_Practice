package day11_practice_task;

public class Carpet {

    public double width , length, unitPrice;
    public boolean isPerson;


    public Carpet(int width, int length, int unitPrice, boolean isPerson) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPerson = isPerson;
    }


    public double calcCost(){

        double totalCost = (width*length) *unitPrice;

        if (isPerson){
            totalCost += 200;
        }
        return totalCost;

}

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPerson=" + isPerson +
                ", total price =" + calcCost() +
                '}';
    }
}







/*
Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.

 */