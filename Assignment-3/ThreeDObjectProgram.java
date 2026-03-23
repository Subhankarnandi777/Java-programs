class ThreeDObject {
    double surfaceArea() { return 0; }
    double volume() { return 0; }
}

class Box extends ThreeDObject {
    double l, w, h;
    Box(double l, double w, double h) {
        this.l = l; this.w = w; this.h = h;
    }

    double surfaceArea() {
        return 2 * (l*w + w*h + h*l);
    }

    double volume() {
        return l * w * h;
    }
}

class Cube extends ThreeDObject {
    double a;
    Cube(double a) { this.a = a; }

    double surfaceArea() { return 6 * a * a; }
    double volume() { return a * a * a; }
}

class ThreeDObjectProgram {
    public static void main(String[] args) {

        Box b = new Box(2,3,4);
        Cube c = new Cube(3);

        System.out.println("Box Volume = " + b.volume());
        System.out.println("Box Surface Area = " + b.surfaceArea());

        System.out.println("Cube Volume = " + c.volume());
        System.out.println("Cube Surface Area = " + c.surfaceArea());
    }
}
