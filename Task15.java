//Define an interface called Shape with the following methods
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

//Create an abstract class called AbstractShape that implements Shape
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    //A constructor to initialize these attributes
    AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    //Implementations for calculateArea and calculatePerimeter
    @Override
    public double calculateArea() {
        return length * width; // default formula (for rectangle)
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width); // default formula (for rectangle)
    }
}

//Implement concrete class Circle that extends AbstractShape
class Circle extends AbstractShape {
    double radius;

    Circle(String color, double radius) {
        super(color, 0, 0); // Circle doesn’t use length/width
        this.radius = radius;
    }

    // Circle’s own implementation
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

//Implement concrete class Rectangle that extends AbstractShape
class Rectangle extends AbstractShape {
    Rectangle(String color, double length, double width) {
        super(color, length, width);
    }
    // No need to override since AbstractShape already has correct formulas
}

//In the Main class: create instances and display results
public class Task15 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 4, 6);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
