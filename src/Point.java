import java.util.Scanner;

//class point to get single responsibilty
class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //applying factory design parttern to get the point of a triangle
    static class PointFactory {
        Point createPoint(Scanner scanner) {
            System.out.println("Enter x coordinate:");
            double x = scanner.nextDouble();
            System.out.println("Enter y coordinate:");
            double y = scanner.nextDouble();
            return new Point(x, y);
        }
    }
}