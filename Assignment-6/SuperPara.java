class P2 {
    P2(int x) {
        System.out.println("Parent Constructor: " + x);
    }
}

class SuperPara extends P2 {
    SuperPara() {
        super(50);
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new SuperPara();
    }
}
