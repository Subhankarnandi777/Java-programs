import javax.swing.*;
import java.awt.*;

class ChatFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("Chat Frame");

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");
        menu.add(exit);
        mb.add(menu);

        JPanel p = new JPanel();
        JLabel l = new JLabel("Message:");
        JTextField tf = new JTextField(15);
        JButton b = new JButton("Send");

        p.add(l);
        p.add(tf);
        p.add(b);

        f.setJMenuBar(mb);
        f.add(p, BorderLayout.CENTER);

        f.setSize(400,200);
        f.setVisible(true);
    }
}
