package h04;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        //De afgeronde rechthoek als dobbelsteen
        g.setColor(Color.black);
        g.drawRoundRect(20, 20, 300, 300, 20, 10);
        g.setColor(Color.black);

        //De vier ogen
        g.fillArc(50, 50, 50, 50, 90, 360);
        g.fillArc(50, 250, 50, 50, 90, 360);
        g.fillArc(250, 250, 50, 50, 90, 360);
        g.fillArc(250, 50, 50, 50, 90, 360);


    }
}
