class ThrowDemo {
    static void check(int age) {
        if(age < 18)
            throw new ArithmeticException("Not Eligible");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        check(15);
    }
}
