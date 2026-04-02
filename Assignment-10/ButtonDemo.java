import javax.swing.*;

class ButtonDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Demo");
        JButton b = new JButton("Click");
        b.setBounds(100,100,100,40);

        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
