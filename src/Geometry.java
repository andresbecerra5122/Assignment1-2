import java.util.Scanner;



public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointFactory pointFactory = new PointFactory();
        

        System.out.println("Enter the coordinates for Point 1:");

        System.out.println("Enter the coordinates for Point 1:");
        Point point1 = pointFactory.createPoint(scanner);

        System.out.println("Enter the coordinates for Point 2:");
        Point point2 = pointFactory.createPoint(scanner);

        System.out.println("Enter the coordinates for Point 3:");
        Point point3 = pointFactory.createPoint(scanner);

        Triangle triangle = new Triangle(point1, point2, point3);
        double perimeter = triangle.calculatePerimeter();

        System.out.println("Perimeter: " + perimeter);
        if (triangle.isIsosceles()) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is not isosceles.");
        }
    }
}
