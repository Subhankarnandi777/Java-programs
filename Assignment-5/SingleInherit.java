class Animal {
    void eat() {
        System.out.println("Animal Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barking");
    }
}

class SingleInherit {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
