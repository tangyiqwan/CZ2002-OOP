package shapes.twoDshapes;
public class Triangle implements Shape {
    private double base;
    private double height;

    // constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }
    
    public double computeArea() {
        return 0.5 * base * height;
    }
}