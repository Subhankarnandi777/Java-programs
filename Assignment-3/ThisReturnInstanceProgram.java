class ThisReturnInstanceProgram {

    ThisReturnInstanceProgram getObject() {
        return this;
    }

    void display() {
        System.out.println("Returning current class instance");
    }

    public static void main(String[] args) {
        ThisReturnInstanceProgram obj = new ThisReturnInstanceProgram();
        obj.getObject().display();
    }
}
