class P1 {
    P1() {
        System.out.println("Parent Constructor");
    }
}

class SuperNoPara extends P1 {
    SuperNoPara() {
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new SuperNoPara();
    }
}
