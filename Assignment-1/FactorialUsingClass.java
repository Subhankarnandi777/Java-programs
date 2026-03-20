class FactorialCalculator {

    int findFactorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

class FactorialUsingClass {
    public static void main(String[] args) {
        FactorialCalculator obj = new FactorialCalculator();
        System.out.println("Factorial = " + obj.findFactorial(5));
    }
}
