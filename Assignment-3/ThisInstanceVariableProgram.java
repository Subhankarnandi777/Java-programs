class ThisInstanceVariableProgram {

    int x;

    ThisInstanceVariableProgram(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("Value of x = " + x);
    }

    public static void main(String[] args) {
        ThisInstanceVariableProgram obj = new ThisInstanceVariableProgram(25);
        obj.display();
    }
}
