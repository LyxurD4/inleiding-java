package h04;

import java.awt.*;
import java.applet.*;

public class NederlandseVlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.magenta);
        g.setColor(Color.BLACK);
        g.fillRect(20, 20, 5, 200);
        g.setColor(Color.red);
        g.fillRect(25, 20, 150, 30);
        g.setColor(Color.white);
        g.fillRect(25, 50, 150, 30);
        g.setColor(Color.blue);
        g.fillRect(25, 80, 150, 30);
    }
}
