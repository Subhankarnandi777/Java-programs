import java.applet.Applet;
import java.awt.Graphics;

public class AppParam extends Applet {
    String msg;

    public void init() {
        msg = getParameter("msg");
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 50);
    }
}
