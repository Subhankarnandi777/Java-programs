class FinallyDemo {
    public static void main(String[] args) {

        // Case 1
        try {
            int a = 10 / 2;
        } finally {
            System.out.println("Finally Block Case 1");
        }

        // Case 2
        try {
            int b = 10 / 0;
        } finally {
            System.out.println("Finally Block Case 2");
        }

        // Case 3
        try {
            int c = 10 / 0;
        } catch (Exception e) {
            System.out.println("Handled Exception");
        } finally {
            System.out.println("Finally Block Case 3");
        }
    }
}
