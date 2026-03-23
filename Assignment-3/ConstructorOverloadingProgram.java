class ConstructorOverloadingProgram {

    ConstructorOverloadingProgram() {
        System.out.println("Default Constructor");
    }

    ConstructorOverloadingProgram(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        ConstructorOverloadingProgram obj1 = new ConstructorOverloadingProgram();
        ConstructorOverloadingProgram obj2 = new ConstructorOverloadingProgram(100);
    }
}
