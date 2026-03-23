class BClass {
    BClass(ThisAsConstructorArgumentProgram obj) {
        System.out.println("Constructor called with this argument");
    }
}

class ThisAsConstructorArgumentProgram {

    ThisAsConstructorArgumentProgram() {
        BClass obj = new BClass(this);
    }

    public static void main(String[] args) {
        new ThisAsConstructorArgumentProgram();
    }
}
