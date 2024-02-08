package day7_practice_task;

public class Rectangle {


    public double width;
    public double length;

    public double area;

    public  double perimeter;



    public void calculateArea(){
        System.out.println(width*length);

    }


    public void calculatePerimeter(){
        System.out.println((width+length)*2);
        }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}











/*2. Create a custom class named Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.


      Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object
      /*
 */