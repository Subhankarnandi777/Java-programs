interface A1 {
    void showA();
}

interface B1 extends A1 {
    void showB();
}

class MultiInter implements B1 {
    public void showA() {
        System.out.println("Interface A");
    }

    public void showB() {
        System.out.println("Interface B");
    }

    public static void main(String[] args) {
        MultiInter obj = new MultiInter();
        obj.showA();
        obj.showB();
    }
}
