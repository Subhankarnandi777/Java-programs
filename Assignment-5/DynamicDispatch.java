class P {
    void display() {
        System.out.println("Parent Display");
    }
}

class Q extends P {
    void display() {
        System.out.println("Child Display");
    }
}

class DynamicDispatch {
    public static void main(String[] args) {
        P obj;

        obj = new P();
        obj.display();

        obj = new Q();
        obj.display();
    }
}
