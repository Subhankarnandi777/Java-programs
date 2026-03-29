import mypack.PackDemo;
import mypack.subpack.SubPackDemo;

class PackSubAccess {
    public static void main(String[] args) {
        PackDemo p = new PackDemo();
        SubPackDemo s = new SubPackDemo();

        p.show();
        s.display();
    }
}
