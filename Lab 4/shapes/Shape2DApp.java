package shapes;
import shapes.twoDshapes.*;
import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        System.out.println("Enter the total number of shapes: ");
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        
        Shape[] shapeList = new Shape[total];
        for (int i = 0; i < total; i++) {
            System.out.println("Choose a shape (Rectangle, Square, Circle, Triangle): ");
            String shapeString = scan.next();

            switch(shapeString) {
                case("Rectangle"):
                    System.out.println("Please insert length and breadth of the rectangle separated by space:");
                    double length = scan.nextDouble();
                    double breadth = scan.nextDouble();
                    Rectangle rectangle = new Rectangle(length, breadth);
                    shapeList[i] = rectangle;
                    break;
                case("Square"):
                    System.out.println("Please insert side length of the square:");
                    double side_length = scan.nextDouble();
                    Square square = new Square(side_length);
                    shapeList[i] = square;
                    break;
                case("Circle"):
                    System.out.println("Please insert radius of the circle:");
                    double radius = scan.nextDouble();
                    Circle circle = new Circle(radius);
                    shapeList[i] = circle;
                    break; 
                case("Triangle"):
                    System.out.println("Please insert base and height of the triangle separated by space:");
                    double base = scan.nextDouble();
                    double height = scan.nextDouble();
                    Triangle triangle = new Triangle(base, height);
                    shapeList[i] = triangle;
                    break; 
                default:
                    System.out.println("This shape does not exist");
                    i -= 1;
                    break;
            }
        }
        System.out.println("Choose a type of calculation (Area):");
        String calculationString = scan.next();
        switch (calculationString) {
            case("Area"):
                double area = 0;
                for (int i = 0; i < total; i++) {
                    area += shapeList[i].computeArea();

                }
                System.out.println("The total area of all the shapes is " + area);
                break;
            default:
                System.out.println("Error");
                break;
        }
        scan.close();

    }
    
    
}
