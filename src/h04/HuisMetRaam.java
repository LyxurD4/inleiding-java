package h04;

import java.awt.*;
import java.applet.*;

public class HuisMetRaam extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.green);
        g.drawRect(100, 200, 300, 300);
        g.drawLine(100, 200, 250, 20);
        g.drawLine(250, 20, 400, 200);
        g.drawRect(120, 450, 20, 50);
        g.drawRect(180, 450, 40, 40);
        g.drawLine(180, 470, 220, 470);
        g.drawLine(200, 450, 200, 490);
    }
}
