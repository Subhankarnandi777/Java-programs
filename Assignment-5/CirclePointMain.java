class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point center;
    double radius;

    Circle(int x, int y, double r) {
        center = new Point(x, y);
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class CirclePointMain {
    public static void main(String[] args) {
        Circle c = new Circle(2, 3, 5);
        System.out.println("Area = " + c.area());
    }
}
