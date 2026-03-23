class ThisInvokeConstructorProgram {

    ThisInvokeConstructorProgram() {
        this(50);
        System.out.println("Default Constructor");
    }

    ThisInvokeConstructorProgram(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new ThisInvokeConstructorProgram();
    }
}
