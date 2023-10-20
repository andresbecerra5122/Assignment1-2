import java.util.Scanner;

public class Coordinates {
    public Point Point1;
    public Point Point2;
    public Point Point3;

    public void InputCoordinates() {
        Point.PointFactory pointFactory = new Point.PointFactory();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the coordinates for Point 1:");
        Point1 = pointFactory.createPoint(scanner);

        System.out.println("Enter the coordinates for Point 2:");
        Point2 = pointFactory.createPoint(scanner);

        System.out.println("Enter the coordinates for Point 3:");
        Point3 = pointFactory.createPoint(scanner);
    }
}
