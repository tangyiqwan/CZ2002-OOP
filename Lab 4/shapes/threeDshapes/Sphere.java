package shapes.threeDshapes;
import shapes.twoDshapes.Shape;

public class Sphere implements Shape{
    private double radius;
    // constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return 4 * Math.PI * Math.pow(radius, 2) ;  // surface area
    }
}
