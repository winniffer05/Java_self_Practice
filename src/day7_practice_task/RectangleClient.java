package day7_practice_task;

public class RectangleClient {

    public static void main(String[] args) {

       Rectangle rectangle = new Rectangle();
       rectangle.length = 30.5;
       rectangle.width = 20.5;
       rectangle.area = rectangle.width * rectangle.length;
       rectangle.perimeter = rectangle.area * 2;


        System.out.println("The width of the rectangle is: " + rectangle.width );
        System.out.println("The length of the rectangle is: " + rectangle.length);





       rectangle.calculateArea();
       rectangle.calculatePerimeter();





    }
}
