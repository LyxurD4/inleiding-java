package h02;

import java.awt.*;
import java.applet.*;

public class NaamOpAchtergrond extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawString("Maurits", 20, 20);

    }
}
