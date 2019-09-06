package h04;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRoundRect(20, 20, 150, 300, 10, 10);
        g.fillRect(95, 320, 10, 150);

        g.setColor(Color.red);
        g.fillArc(72, 70, 50, 50, 90, 360);

        g.setColor(Color.yellow);
        g.fillArc(72, 140, 50, 50, 90, 360);

        g.setColor(Color.green);
        g.fillArc(72, 210, 50, 50, 90, 360);

    }
}