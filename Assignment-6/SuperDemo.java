class Parent {
    int x = 10;
}

class SuperDemo extends Parent {
    int x = 20;

    void display() {
        System.out.println("Parent x = " + super.x);
        System.out.println("Child x = " + x);
    }

    public static void main(String[] args) {
        SuperDemo obj = new SuperDemo();
        obj.display();
    }
}
