package h04;

//Wat is een platform?
//Een apparaat waar de code op kan lopen

//Waarom hoeft een programmeur in Java maar één keer een programma te schrijven voor verschillende platforms?
//Omdat Java op meerdere platforms aansluit

//Wat is bytecode
//Bytecode is de taal waarin de computer de geschreven code omzet om het te runnen

//Wat is JVM?
//JVM is een omgeving voor het uitvoeren van Java bytecode

//Met welke methode kun je een vierkant tekenen?
//met de drawRect methode

//Noem drie methodes waarmee je een cirkel kunt tekenen
//drawArc, drawOval en de drawRoundRect

//Waarom worden de opdrachten voor het scherm in paint gezet en niet in een andere methode?
//Omdat met paint er dingen kunnen verschijnen in de Applet. dit zou niet lukken als je dat er niet in zou zetten

import java.awt.*;
import java.applet.*;

public class Driehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.green);
        g.drawLine(100, 20, 50, 100);
        g.drawLine(100, 20, 150, 100);
        g.drawLine(50, 100, 150, 100);
    }
}
