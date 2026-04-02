import javax.swing.*;

class TextFieldDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("TextField Demo");
        JTextField tf = new JTextField();

        tf.setBounds(50,50,150,30);
        f.add(tf);

        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
