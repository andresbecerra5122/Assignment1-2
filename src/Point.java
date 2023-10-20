import java.util.Scanner;

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

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