class ParentFM {
    final void show() {
        System.out.println("Final Method");
    }
}

class FinalMethod extends ParentFM {
    public static void main(String[] args) {
        FinalMethod obj = new FinalMethod();
        obj.show();
    }
}
