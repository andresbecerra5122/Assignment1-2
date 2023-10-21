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

            PrintResults(triangleOperator, perimeter);

            Scanner scanner = new Scanner(System.in);

            CalculatePointinside(triangleOperator,scanner);

            stillhaveTriangles = StillWantToRun(scanner);
        }
    }

    private static void CalculatePointinside(TraingleHelper triangleOperator, Scanner scanner) {

        Point.PointFactory pointFactory = new Point.PointFactory();
        Point PointTest = pointFactory.createPoint(scanner);

        if (triangleOperator.IspointInside(PointTest)) {
            System.out.println("The point is inside the trinagle.");
        } else {
            System.out.println("The point is not inside the triangle");
        }
    }

    private static boolean StillWantToRun(Scanner scanner) {
        System.out.println("Want to add another Triangle ? press 1");
        try {
            int x = scanner.nextInt();
            return x == 1;
        }
        catch (Exception E)
        {
            System.exit(0);
        }

        return false;
    }

    private static void PrintResults(TraingleHelper triangleOperator, double perimeter) {
        System.out.println("Perimeter: " + perimeter);
        if (triangleOperator.isIsosceles()) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is not isosceles.");
        }
    }
}
