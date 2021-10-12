package shapes.threeDshapes;
import shapes.twoDshapes.Shape;
import shapes.twoDshapes.Triangle;

public class Pyramid extends Triangle implements Shape {
    public Pyramid(double base, double height) {
        super(base, height);
    }

    @Override
    public double computeArea() {
        return 4 * super.computeArea() + Math.pow(super.getBase(), 2);  // 4 triangles + square
    }
}
