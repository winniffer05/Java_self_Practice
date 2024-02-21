package day13_practice_task;

public class Iphone {

    public Iphone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    private String brand,model,size,color;
    private double price;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand==null){
            System.out.println("Invalid brand");
            System.exit(1);
        }
        if (brand.isBlank()||brand.isEmpty()){
            System.out.println("Invalid brand");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model==null){
            System.out.println("Invalid Model");
            System.exit(1);
        }
        if (model.isBlank()||model.isEmpty()){
            System.out.println("Invalid model");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null){
            System.out.println("Invalid Color");
            System.exit(1);
        }
        if (color.isBlank()||color.isEmpty()){
            System.out.println("Invalid color");
            System.exit(1);
        }


        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.out.println("Invalid Price");
            System.exit(1);
        }
        this.price = price;
    }


    public void Call() {
        System.out.println("calling the number [913-000-0090]");
    }

    public void Text(){
        System.out.println("texting to the number [651-990-0808]");
    }


    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
