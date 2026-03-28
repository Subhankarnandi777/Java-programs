interface Inter {
    void show();
}

class InterDemo implements Inter {
    public void show() {
        System.out.println("Interface Method");
    }

    public static void main(String[] args) {
        InterDemo obj = new InterDemo();
        obj.show();
    }
}
