
class Triangle {
    Point p1, p2, p3;

    Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    double calculateDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    double calculatePerimeter() {
        double side1 = calculateDistance(p1, p2);
        double side2 = calculateDistance(p2, p3);
        double side3 = calculateDistance(p1, p3);
        return side1 + side2 + side3;
    }

    boolean isIsosceles() {
        double side1 = calculateDistance(p1, p2);
        double side2 = calculateDistance(p2, p3);
        double side3 = calculateDistance(p1, p3);
        return (side1 == side2) || (side1 == side3) || (side2 == side3);
    }
}


