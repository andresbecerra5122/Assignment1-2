import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Geometry {

    public static void main(String[] args) {

        StartProgram();
    }

    private static void StartProgram() {

        ArrayList<Triangle> AllTrinagles = new ArrayList<>();

        Coordinates getcoordinates = new Coordinates();

        getcoordinates.InputCoordinates();

        Triangle triangle = new Triangle(getcoordinates.Point1,
                getcoordinates.Point2,
                getcoordinates.Point3);

        AllTrinagles.add(triangle);

        TraingleHelper triangleOperator = new TraingleHelper(triangle);

        double perimeter = triangleOperator.calculatePerimeter();

        printResults(triangleOperator,perimeter);
    }

    private static void printResults(TraingleHelper triangleOperator, double perimeter) {
        System.out.println("Perimeter: " + perimeter);
        if (triangleOperator.isIsosceles()) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is not isosceles.");
        }
    }
}
