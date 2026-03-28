interface M {
    void m1();
}

interface N {
    void m2();
}

class MultiInter2 implements M, N {
    public void m1() {
        System.out.println("Interface M");
    }

    public void m2() {
        System.out.println("Interface N");
    }

    public static void main(String[] args) {
        MultiInter2 obj = new MultiInter2();
        obj.m1();
        obj.m2();
    }
}
