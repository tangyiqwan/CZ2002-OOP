package shapes.threeDshapes;

import shapes.twoDshapes.Circle;
import shapes.twoDshapes.Shape;

public class Cone implements Shape{
    private double radius;
    private double slantHeight;
    Circle circle;

    // constructor
    public Cone(double radius, double slantHeight) {
        this.radius = radius;
        this.slantHeight = slantHeight;
        circle = new Circle(radius);
        
    }

    @Override
    public double computeArea() {
        return circle.computeArea() + Math.PI * radius * slantHeight;
    }
}
