class ThisInvokeMethodProgram {

    void display() {
        System.out.println("Display method called");
    }

    void show() {
        this.display();
    }

    public static void main(String[] args) {
        ThisInvokeMethodProgram obj = new ThisInvokeMethodProgram();
        obj.show();
    }
}
