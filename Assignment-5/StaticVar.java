class StaticVar {
    static int count = 0;

    StaticVar() {
        count++;
        System.out.println("Object Count = " + count);
    }

    public static void main(String[] args) {
        new StaticVar();
        new StaticVar();
        new StaticVar();
    }
}
