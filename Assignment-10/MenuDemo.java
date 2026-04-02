import javax.swing.*;

class MenuDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Demo");

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem i1 = new JMenuItem("Open");
        JMenuItem i2 = new JMenuItem("Exit");

        menu.add(i1);
        menu.add(i2);
        mb.add(menu);

        f.setJMenuBar(mb);
        f.setSize(300,200);
        f.setVisible(true);
    }
}
