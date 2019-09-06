package h05;

import java.awt.*;
import java.applet.*;

public class Hoofstuk5Opdracht1 extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.YELLOW;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
        //Niet het mooiste resultaat, maar het werkt
    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        //Lijn
        g.drawLine(20, 20, 200, 20);
        g.drawString("Lijn", 90, 35);

        //Rechthoek
        g.drawRect(20, 50, breedte, hoogte);
        g.drawString("Rechthoek", 80, 115);

        //Afgeronde rechthoek
        g.drawRoundRect(20, 130, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde rechthoek", 65, 215);

        //Gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(250, 20, breedte, hoogte);
        g.setColor(Color.black);
        g.drawOval(250, 20, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 260, 115);

        //Gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(250, 130, breedte, hoogte);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 300, 225);

        //Taartpunt met ovaal eromheen
        g.drawOval(500, 20, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(500, 20, breedte, hoogte, 360, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 500, 135);

        //Cirkel
        g.drawArc(525, 160, breedte, hoogte, 90, 365);
        g.drawString("Cirkel", 560, 280);

    }
}
