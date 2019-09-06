package h04;

import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        //Lijnen van de grafiek
        g.drawLine(60, 20, 60, 480);
        g.drawLine(60, 480, 400, 480);

        //Schaalverdeling
        g.drawString("0", 50, 480);
        g.drawString("20", 45, 400);
        g.drawString("40", 45, 320);
        g.drawString("60", 45, 240);
        g.drawString("80", 45, 160);
        g.drawString("100", 35, 80);
        g.drawString("120", 35, 20);

        //Valerie
        g.setColor(Color.magenta);
        g.fillRect(120, 320, 30, 160);
        g.drawString("Valerie", 110, 500);

        //Jeroen
        g.setColor(Color.cyan);
        g.fillRect(180, 80, 30, 400);
        g.drawString("Jeroen", 170, 500);

        //Hans
        g.setColor(Color.red);
        g.fillRect(240, 160, 30, 320);
        g.drawString("Hans", 240, 500);
    }
}
