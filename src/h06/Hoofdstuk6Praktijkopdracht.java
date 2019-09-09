package h06;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk6Praktijkopdracht extends Applet {
    double Cijfer1;
    double Cijfer2;
    double Cijfer3;
    double Gemiddelde;
    double Gemiddelde2;
    int Gemiddelde3;
    double Gemiddelde4;
    double Gemiddelde5;

    public void init() {
        Cijfer1 = 5.9;
        Cijfer2 = 6.3;
        Cijfer3 = 6.9;
        Gemiddelde = (Cijfer1 + Cijfer2 + Cijfer3) /3;
        Gemiddelde2 = Gemiddelde * 10;
        Gemiddelde3 = (int) Gemiddelde2;
        Gemiddelde4 = Gemiddelde3;
        Gemiddelde5 = Gemiddelde4 /10;

    }

    public void paint(Graphics g) {
        g.drawString("Gemiddelde = " +Gemiddelde5 ,20, 20);
    }
}
