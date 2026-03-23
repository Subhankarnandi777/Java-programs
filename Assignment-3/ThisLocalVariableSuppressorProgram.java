class ThisLocalVariableSuppressorProgram {

    int num;

    void setValue(int num) {
        this.num = num;
    }

    void display() {
        System.out.println("Number = " + num);
    }

    public static void main(String[] args) {
        ThisLocalVariableSuppressorProgram obj = new ThisLocalVariableSuppressorProgram();
        obj.setValue(10);
        obj.display();
    }
}
