class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    double div(double a, double b) {
        return a / b;
    }
}

class CalcMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Add int = " + c.add(5,3));
        System.out.println("Add double = " + c.add(5.5,2.5));
        System.out.println("Sub = " + c.sub(10,5));
        System.out.println("Mul = " + c.mul(4,3));
        System.out.println("Div = " + c.div(10,2));
    }
}
