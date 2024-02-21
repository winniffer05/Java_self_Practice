package day12_practice_task;

public class CircleClient {
    public static void main(String[] args) {


        Circle circle1 = new Circle(6);
        Circle circle2 = new Circle(8);

        System.out.println(circle1);
        System.out.println(circle1.calcArea());
        System.out.println(circle1.CalcPerimeter());

        System.out.println();

        System.out.println(circle2);
        System.out.println(circle2.calcArea());
        System.out.println(circle2.CalcPerimeter());



    }


}
