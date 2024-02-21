package day12_practice_task;

class Item {

    private int unitPrice;
    private  int quantity;
    private String name;

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        if (unitPrice < 0)
            System.err.println("Unit Price Cannot be Negative");
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<0){
            System.err.println("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            System.err.println("Name cannot be empty or blank");
            System.exit(1);
        }

        if (!name.matches("@#$%^&*+!")){
            System.err.println("Name cannot contains special Characters");
            System.exit(1);
        }
        this.name = name;

    }


    public Item(int unitPrice, int quantity, String name) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.name = name;
    }


    public double calcCost(){
        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                '}';
    }
}
/*
Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.

 */