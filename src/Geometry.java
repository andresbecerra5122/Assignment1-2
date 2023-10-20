import java.util.Scanner;



public class Geometry {
    public static void main(String[] args) {

        Coordinates getcoordinates = new Coordinates();

        getcoordinates.InputCoordinates();

        Triangle triangle = new Triangle(getcoordinates.Point1,
        getcoordinates.Point2,
        getcoordinates.Point3);

        TraingleHelper triangleOperator = new TraingleHelper(triangle);

        double perimeter = triangleOperator.calculatePerimeter();

        System.out.println("Perimeter: " + perimeter);
        if (triangleOperator.isIsosceles()) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is not isosceles.");
        }
    }
}
