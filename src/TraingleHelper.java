public class TraingleHelper {

    Triangle trinagle;
    public TraingleHelper(Triangle triangle) {
        this.trinagle = triangle;
    }

    double calculateDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    double calculatePerimeter() {
        double side1 = calculateDistance(trinagle.p1, trinagle.p2);
        double side2 = calculateDistance(trinagle.p2, trinagle.p3);
        double side3 = calculateDistance(trinagle.p1, trinagle.p3);
        return side1 + side2 + side3;
    }

    boolean isIsosceles() {
        double side1 = calculateDistance(trinagle.p1, trinagle.p2);
        double side2 = calculateDistance(trinagle.p2, trinagle.p3);
        double side3 = calculateDistance(trinagle.p1, trinagle.p3);
        return (side1 == side2) || (side1 == side3) || (side2 == side3);
    }
}
