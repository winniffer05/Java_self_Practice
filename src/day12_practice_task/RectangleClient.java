package day12_practice_task;

public class RectangleClient {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3,8);
        Rectangle rectangle1 = new Rectangle(5,8);


        System.out.println(rectangle1);
        System.out.println(rectangle1.calcArea());
        System.out.println(rectangle1.CalcPerimeter());

        System.out.println("=------------=");

        System.out.println(rectangle);
        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.CalcPerimeter());



    }
}
