class FinalParent {
    final void show() {
        System.out.println("Final Method");
    }
}

class StopOverride extends FinalParent {
    public static void main(String[] args) {
        StopOverride obj = new StopOverride();
        obj.show();
    }
}
