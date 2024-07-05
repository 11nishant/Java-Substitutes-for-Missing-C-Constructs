import java.lang.Math;

enum ShapeType {
    RECTANGLE,
    CIRCLE
}

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    double area() {
        return Math.PI * radius * radius;
    }
}


















public class Union {
    public static void main(String[] args) {


        ShapeType shapeType = ShapeType.CIRCLE;
       
        switch (shapeType) {
            case RECTANGLE:
                Rectangle newRectangle = new Rectangle(8, 64);
                System.out.println("Area of new rectangle: " + newRectangle.area());
                break;
            case CIRCLE:
             Circle circle = new Circle(7);
 System.out.println("Area of new Circle: " + circle.area());
                break;
            default :
            System.out.println(-1 + "[Invalid Tag]");
        }
    }
}

