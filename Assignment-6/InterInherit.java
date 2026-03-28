interface X {
    void display();
}

interface Y extends X {
    void show();
}

class InterInherit implements Y {
    public void display() {
        System.out.println("Display Method");
    }

    public void show() {
        System.out.println("Show Method");
    }

    public static void main(String[] args) {
        InterInherit obj = new InterInherit();
        obj.display();
        obj.show();
    }
}
