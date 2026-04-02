class Shape {
    double area() { return 0; }
    double perimeter() { return 0; }
}

class Circle extends Shape {
    double r = 5;
    double area() { return 3.14 * r * r; }
    double perimeter() { return 2 * 3.14 * r; }
}

class Rectangle extends Shape {
    double l = 4, w = 3;
    double area() { return l * w; }
    double perimeter() { return 2 * (l + w); }
}

class Triangle extends Shape {
    double a = 3, b = 4, c = 5;
    double perimeter() { return a + b + c; }
}

class ShapeMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        System.out.println("Circle Area = " + c.area());
        System.out.println("Rectangle Area = " + r.area());
        System.out.println("Triangle Perimeter = " + t.perimeter());
    }
}
