package h02;


//Wat is machinetaal?
//Machinetaal is een taal waarin opdrahten geveven worden voor de processor van de computer

//Welke drie hulpmiddelen heb je nodig om te progammeren?
//een editor, geïmporteerde klassen en code

//Hoe herken je opdrachten in de broncode?
//Door tussen de accolades te kijken in de code

//Waartoe dienen de import-opdrachten?
//Import opdrachten kunnen code die al is geschreven gebruiken om zo de code makkeijker en korter te houden

//Wat is een methode?
//Een methode zijn een aantal opdrachten met een naam erboven
import java.awt.*;
import java.applet.*;

public class NaamOpAchtergrond extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawString("Maurits", 20, 20);

    }
}
