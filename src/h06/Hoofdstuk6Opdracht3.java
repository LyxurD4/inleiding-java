package h06;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk6Opdracht2 extends Applet {
    int Positief1;
    int Positief2;
    int Uitkomst;

    public void init() {
        Positief1 = -1;
        Positief2 = -1;
        Uitkomst = Positief1 + Positief2;
    }

    public void paint(Graphics g) {
        g.drawString("1 + 1 =" +Uitkomst ,20, 20);
    }
}
