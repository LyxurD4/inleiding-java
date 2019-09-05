package h04;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        //Lijn
        g.drawLine(20, 20, 200, 20);
        g.drawString("Lijn", 90, 35);

        //Rechthoek
        g.drawRect(20, 50, 180, 50);
        g.drawString("Rechthoek", 80, 115);

        //Afgeronde rechthoek
        g.drawRoundRect(20, 130, 180, 70, 30, 30);
        g.drawString("Afgeronde rechthoek", 65, 215);

        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(250, 20, 180, 80);
        g.setColor(Color.black);
        g.drawOval(250, 20, 180, 80);
        g.drawString("Gevulde rechthoek met ovaal", 260, 115);

        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(250, 130, 180, 80);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 300, 225);

        //Taartpunt met ovaal eromheen
        g.drawOval(500, 20, 150, 100);
        g.setColor(Color.magenta);
        g.fillArc(500, 20, 150, 100, 360, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 500, 135);

        //Cirkel
        g.drawArc(525, 160, 100, 100, 90, 365);
        g.drawString("Cirkel", 560, 280);

    }
}
