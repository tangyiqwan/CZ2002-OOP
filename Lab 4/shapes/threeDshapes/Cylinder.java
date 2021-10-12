package shapes.threeDshapes;

import shapes.twoDshapes.Circle;
import shapes.twoDshapes.Rectangle;
import shapes.twoDshapes.Shape;

public class Cylinder implements Shape{
    private double radius;
    private double height;
    Circle circle;
    Rectangle rectangle;

    // constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        circle = new Circle(radius);
        rectangle = new Rectangle(2 * Math.PI * radius, height);
    }

    @Override
    public double computeArea() {
        return (2 * circle.computeArea() + rectangle.computeArea());
    }
}
