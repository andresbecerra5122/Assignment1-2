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

    public boolean IspointInside(Point pointTest) {
        double denominator = ((trinagle.p2.y - trinagle.p3.y) * (trinagle.p1.x - trinagle.p3.x) +
                (trinagle.p3.x - trinagle.p2.x) * (trinagle.p1.y - trinagle.p3.y));

        double alpha = ((trinagle.p2.y - trinagle.p3.y) * (pointTest.x - trinagle.p3.x) +
                ( trinagle.p3.x - trinagle.p2.x) * (pointTest.y - trinagle.p3.y)) / denominator;

        double beta = (( trinagle.p3.y - trinagle.p1.y) * ( pointTest.x - trinagle.p3.x) +
                ( trinagle.p1.x - trinagle.p3.x) * (pointTest.y - trinagle.p3.y)) / denominator;
        double gamma = 1 - alpha - beta;

        return alpha >= 0 && beta >= 0 && gamma >= 0;
    }
}
