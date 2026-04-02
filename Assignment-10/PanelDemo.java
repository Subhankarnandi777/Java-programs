import javax.swing.*;

class PanelDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Panel Demo");
        JPanel p = new JPanel();

        p.add(new JButton("Button"));
        f.add(p);

        f.setSize(300,200);
        f.setVisible(true);
    }
}
