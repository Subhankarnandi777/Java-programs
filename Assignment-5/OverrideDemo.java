class Parent {
    void show() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child Class");
    }
}

class OverrideDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
