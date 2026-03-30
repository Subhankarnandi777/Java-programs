class ThrowsDemo {

    static void test() throws ArithmeticException {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
