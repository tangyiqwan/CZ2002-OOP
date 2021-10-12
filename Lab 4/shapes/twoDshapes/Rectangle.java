package shapes.twoDshapes;
public class Rectangle implements Shape {
    private double length;
    private double breadth;

    // constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double computeArea() {
        return length * breadth;
    }
    
}
