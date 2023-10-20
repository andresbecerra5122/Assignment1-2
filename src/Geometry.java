import java.util.ArrayList;
import java.util.Scanner;


public class Geometry {

    public static void main(String[] args) {

        StartProgram();
    }

    private static void StartProgram() {

        ArrayList<Triangle> AllTrinagles = new ArrayList<>();
        boolean stillhaveTriangles = true;

        while(stillhaveTriangles) {

            Coordinates getcoordinates = new Coordinates();

            getcoordinates.InputCoordinates();

            Triangle triangle = new Triangle(getcoordinates.Point1,
                    getcoordinates.Point2,
                    getcoordinates.Point3);

            AllTrinagles.add(triangle);

            TraingleHelper triangleOperator = new TraingleHelper(triangle);

            double perimeter = triangleOperator.calculatePerimeter();

            printResults(triangleOperator, perimeter);

            stillhaveTriangles = stillWantToRun();
        }
    }

    private static boolean stillWantToRun() {
        System.out.println("Want to add another Triangle ? press 1");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
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
