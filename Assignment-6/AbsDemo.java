abstract class ShapeAbs {
    abstract void area();
}

class CircleAbs extends ShapeAbs {
    void area() {
        System.out.println("Area of Circle");
    }

    public static void main(String[] args) {
        CircleAbs obj = new CircleAbs();
        obj.area();
    }
}
