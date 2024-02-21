package day14_practice_task;

public abstract class Device {

    private  String brand,model, color,size;
    private double price;
    public static boolean hasBattery= true,
    hasPowerButton = true;

    public Device(String brand, String model, String color, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (brand==null){
            System.err.println("Invalid brand");
            System.exit(1);
        }
        if (brand.isEmpty()||brand.isBlank()){
            System.err.println("Invalid Brand");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model==null){
            System.err.println("Invalid Model");
            System.exit(1);
        }
        if (model.isEmpty()||model.isBlank()){
            System.err.println("Invalid Model");
            System.exit(1);
        }

        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null){
            System.err.println("Invalid Color");
            System.exit(1);
        }
        if (color.isEmpty()||color.isBlank()){
            System.out.println("Invalid color");
            System.exit(1);
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        if (size== null){
            System.err.println("Invalid Size");
            System.exit(1);
        }

        if (size.isEmpty()||size.isBlank()){
            System.err.println("Invalid size");
            System.exit(1);
        }
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <=0){
            System.err.println("Invalid Price");
            System.exit(1);
        }
        this.price = price;
    }



    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}






/*
Device Task Requirements:

1. Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - final size
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions:
        - brand, model, color, and size must not be null or empty.
        - price must be positive.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()

2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()

3. Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.

4. Create an Interface Named 'Downloadable':
    - Abstract Method:
        - downloadApp()

5. Create a Child Interface of Downloadable Named 'AndroidApps':
    - Variables:
        - AppStoreName
        - OS

6. Create a Child Interface of Downloadable Named 'AppleApps':
    - Variables:
        - AppStoreName
        - OS

7. Create the Following Subclasses of Phone:
    - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
    - 'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
    - 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.

8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop

9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.

 */