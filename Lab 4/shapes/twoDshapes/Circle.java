package shapes.twoDshapes;

public class Circle implements Shape {
    private double radius;

    // constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2) ;
    }
    
}
