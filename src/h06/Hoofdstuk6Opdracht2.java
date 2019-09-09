package h06;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk6Opdracht2 extends Applet {
    int Uur;
    int Dag;
    int Jaar;

    public void init() {
        Uur = 60 * 60;
        Dag = Uur * 24;
        Jaar = Uur * 365;
    }

    public void paint(Graphics g) {
        g.drawString("Hoeveel seconden er in een uur, dag en jaar zitten" ,20, 20);
        g.drawString("Uur " +Uur, 20, 40);
        g.drawString("Dag : " +Dag, 20, 60);
        g.drawString("Jaar :" +Jaar, 20, 80);
    }
}
