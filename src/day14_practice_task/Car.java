package day14_practice_task;

public  abstract class  Car {

    private final String model,make;
    private final int year;
    private double price;
    private String color ;


    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }


    public void setPrice(double price){
        this.price = price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Car(String model, String make, int year, double price, String color) {
        if (model== null || model.isEmpty()){
            System.out.println("Invalid model " + model);

        }
        this.model = model;

        if (make== null || make.isEmpty()){
            System.out.println("Invalid Make"+ make);


        }
        this.make = make;


        if (year < 1886){
            System.out.println("Invalid Year");

        }
        this.year = year;

        if ( price <0){
            System.out.println("Invalid Price");
        }
        this.price = price;

        if (color== null || color.isEmpty()){
            System.out.println("Invalid Color " + color);
        }
        this.color=color;;







    }


    public abstract void Drive();

    public  abstract void Start();

    public final void Stop(){
        System.out.println("Press the break to stop the car \" + make + \" \" + model");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Car Task Requirements:
1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()
 */