package h06;

//Waarom is initialiseren van variabelen noodzakelijk?
//Anders heeft de variabele geen waarde

//Waarom is er typecasting noodzakelijk bij de conversie van een double naar een int?
//Anders verschijnt er een foutmelding

//Wat is de uitvoer van dit programma? Geef een verklaring.
//5.0, omdat 8+8= 16 / 5= 5.0 (double kapt af?)

//Wat is de uitvoer van dit programma? Geef een verklaring.
// 10.0, want 8/3=2 2+8= 10

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

