package h04;

import java.awt.*;
import java.applet.*;

public class Elips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 100, 25);
    }
}