package shapes;
import java.util.Scanner;
import shapes.threeDshapes.*;
import shapes.twoDshapes.Shape;

public class Shape3DApp {
    public static void main(String[] args) {

        System.out.println("Enter the total number of 3D shapes: ");
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        
        Shape[] shapeList = new Shape[total];
        for (int i = 0; i < total; i++) {
            System.out.println("Choose a shape and enter its index: ");
            System.out.println("1. Cuboid");
            System.out.println("2. Pyramid");
            System.out.println("3. Sphere");
            System.out.println("4. Cone");
            System.out.println("5. Cylinder");
            int shapeIndex = scan.nextInt();

            switch(shapeIndex) {
                case(1):
                    System.out.println("Please insert length, breadth and height of the cuboid separated by space:");
                    double length = scan.nextDouble();
                    double breadth = scan.nextDouble();
                    double height = scan.nextDouble();
                    Cuboid cuboid = new Cuboid(length, breadth, height);
                    shapeList[i] = cuboid;
                    break;
                case(2):
                    System.out.println("Please insert base and height of the pyramid triangle separated by space:");
                    double base = scan.nextDouble();
                    double height_pyramid = scan.nextDouble();
                    Pyramid pyramid = new Pyramid(base, height_pyramid);
                    shapeList[i] = pyramid;
                    break;
                case(3):
                    System.out.println("Please insert radius of the sphere:");
                    double radius = scan.nextDouble();
                    Sphere sphere = new Sphere(radius);
                    shapeList[i] = sphere;
                    break; 
                case(4):
                    System.out.println("Please insert radius and slant height of the cone separated by space:");
                    double radius_cone = scan.nextDouble();
                    double slantHeight = scan.nextDouble();
                    Cone cone = new Cone(radius_cone, slantHeight);
                    shapeList[i] = cone;
                    break; 
                case(5):
                    System.out.println("Please insert radius and height of the cylinder separated by space:");
                    double radius_cylinder = scan.nextDouble();
                    double height_cylinder = scan.nextDouble();
                    Cylinder cylinder = new Cylinder(radius_cylinder, height_cylinder);
                    shapeList[i] = cylinder;
                    break; 
                default:
                    System.out.println("This shape does not exist");
                    i -= 1;
                    break;
            }
        }
        System.out.println("Choose a type of calculation and enter its index:");
        System.out.println("1. Surface area");
        int calculationIndex = scan.nextInt();
        switch (calculationIndex) {
            case(1):
                double area = 0;
                for (int i = 0; i < total; i++) {
                    area += shapeList[i].computeArea();
                }
                System.out.println("The total surface area of all the 3D shapes is " + area);
                break;
            default:
                System.out.println("Error");
                break;
        }

        scan.close();
    }
}
