package h06;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk6Opdracht1 extends Applet {
    int Geld;
    int Aantal;
    int Uitkomst;

    public void init() {
        Geld = 113;
        Aantal = 4;
        Uitkomst = Geld / Aantal;
    }

    public void paint(Graphics g) {
        g.drawString("Verdiende geld : "+Geld ,20, 20);
        g.drawString("Jan : " +Uitkomst, 20, 40);
        g.drawString("Ali : " +Uitkomst, 20, 60);
        g.drawString("Jeanetta :" +Uitkomst, 20, 80);
        g.drawString("Maurits : "+Uitkomst, 20, 100);
    }
}

