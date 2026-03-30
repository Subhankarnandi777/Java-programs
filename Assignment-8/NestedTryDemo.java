class NestedTryDemo {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch");
            }

            int arr[] = new int[5];
            arr[10] = 20;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch");
        }
    }
}
