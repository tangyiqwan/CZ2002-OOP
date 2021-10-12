package shapes.threeDshapes;
import shapes.twoDshapes.Rectangle;
import shapes.twoDshapes.Shape;

public class Cuboid implements Shape{
    private double length;
    private double breadth;
    private double height;

    Rectangle[] rect = new Rectangle[3];

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;

        rect[0] = new Rectangle(length, breadth);
        rect[1] = new Rectangle(breadth, height);
        rect[2] = new Rectangle(length, height);
    }

    @Override
    public double computeArea() {
        double area = 0;
        for (int i = 0; i < 3; i++) {
            area += 2 * rect[i].computeArea();
        }
        return area;
    }
    


    
}
