class Fraction {
    int num, den;

    Fraction() {
        num = 1;
        den = 1;
    }

    Fraction(int n) {
        num = n;
        den = 1;
    }

    Fraction(int n, int d) {
        num = n;
        den = d;
    }

    void display() {
        System.out.println(num + "/" + den);
    }
}

class FractionMain {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(5);
        Fraction f3 = new Fraction(3,4);

        f1.display();
        f2.display();
        f3.display();
    }
}
