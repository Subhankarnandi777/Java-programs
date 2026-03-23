class ThisAsMethodArgumentProgram {

    void display(ThisAsMethodArgumentProgram obj) {
        System.out.println("Method called with this as argument");
    }

    void show() {
        display(this);
    }

    public static void main(String[] args) {
        ThisAsMethodArgumentProgram obj = new ThisAsMethodArgumentProgram();
        obj.show();
    }
}
