class Shape {
    void show() {
        System.out.println("This is Shape");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing Rectangle");
    }
}

class HierInherit {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.show();
        c.drawCircle();

        r.show();
        r.drawRectangle();
    }
}
