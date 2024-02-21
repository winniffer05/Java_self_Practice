package day14_practice_task;

public  abstract class Phone extends Device{

    public Phone(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    @Override
    public void turnOn() {
        System.out.println("Press the power-button to turn on the phone " + getBrand() + " " + getModel());

    }

    @Override
    public void turnOff() {
        System.out.println("Press the power-button to turn off the phone " + getBrand() + " " + getModel());

    }

    public void call(long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + " is calling " + phoneNumber);

    }

    public void text(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is texting to " + phoneNum);

    }

    @Override
    public String toString() {
        return "Phone{}";
    }
}



/*
Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */