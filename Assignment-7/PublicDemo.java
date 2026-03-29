class PublicDemo {
    public int x = 10;

    public void display() {
        System.out.println("Public Variable = " + x);
    }

    public static void main(String[] args) {
        PublicDemo obj = new PublicDemo();
        obj.display();
    }
}
