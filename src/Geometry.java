import java.util.ArrayList;
import java.util.Scanner;

//main class start point of the app
public class Geometry {

    public static void main(String[] args) {

        StartProgram();
    }

    // adding logic to a method to start and control logic
    private static void StartProgram() {

        //declaration of variables and list
        ArrayList<Triangle> AllTrinagles = new ArrayList<>();
        boolean stillhaveTriangles = true;

        //while loop to keep adding triangles til user wants
        while(stillhaveTriangles) {

            //coordinates class and object
            Coordinates getcoordinates = new Coordinates();

            // get coordinates
            getcoordinates.InputCoordinates();

            // triangle object
            Triangle triangle = new Triangle(getcoordinates.Point1,
                    getcoordinates.Point2,
                    getcoordinates.Point3);

            // add to a list of tirangles as requested
            AllTrinagles.add(triangle);

            // class helper to help get thing from a triangle object
            TraingleHelper triangleOperator = new TraingleHelper(triangle);

            double perimeter = triangleOperator.calculatePerimeter();

            PrintResults(triangleOperator, perimeter);

            Scanner scanner = new Scanner(System.in);

            CalculatePointinside(triangleOperator,scanner);

            stillhaveTriangles = StillWantToRun(scanner);
        }
    }

    //start method to calculate paint inside a triangle
    private static void CalculatePointinside(TraingleHelper triangleOperator, Scanner scanner) {

        Point.PointFactory pointFactory = new Point.PointFactory();
        Point PointTest = pointFactory.createPoint(scanner);

        if (triangleOperator.IspointInside(PointTest)) {
            System.out.println("The point is inside the trinagle.");
        } else {
            System.out.println("The point is not inside the triangle");
        }
    }

    // method in charge to determine if user want to keep adding triangles or not
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

    // method in charge of printing resutls
    private static void PrintResults(TraingleHelper triangleOperator, double perimeter) {
        System.out.println("Perimeter: " + perimeter);
        if (triangleOperator.isIsosceles()) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is not isosceles.");
        }
    }
}
