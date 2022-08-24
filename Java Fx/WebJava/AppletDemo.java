import java.applet.Applet;
import java.awt.*;

public class AppletDemo extends Applet {
    public void paint(Graphics g) {
        g.drawRect(0, 0, 250, 100);
        g.setColor(Color.blue);
        g.drawString("Hello Applet", 20, 30);
    }
}