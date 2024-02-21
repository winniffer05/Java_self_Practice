package day14_practice_task;

public final class Samsung extends Phone implements  AndroidApps{

    public Samsung(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }


    @Override
    public String toString() {
        return "Samsung{}";
    }

    @Override
    public void downloadApp() {

    }
}