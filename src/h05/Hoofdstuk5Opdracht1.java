package h05;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk5Opdracht1 extends Applet {
    //declaratie
    int hoogte;
    int breedte;
    Color opvulkleur;
    Color lijnkleur;
    public void init() {
        hoogte = 100;
        breedte= 250;
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;

    }


    public void paint(Graphics g) {
        //teken lijn
        g.setColor(lijnkleur);
        g.drawLine(300,50,50,50);
        g.drawString("Lijn", 155,75);

        //teken rechthoek
        g.drawRect(50,95,breedte,hoogte);
        g.drawString("Rechthoek",140,230);

        //teken afgeronde rechthoek
        g.drawRoundRect(50,250,breedte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek",115,385);

        //teken gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(330,95,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(340,95,230,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",380,230);

        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(340,250,230,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal",415,385);

        //teken taartpunt met ovaal eromheen
        g.setColor(opvulkleur);
        g.fillArc(626,93,206,120,0,45);
        g.setColor(lijnkleur);
        g.drawOval(600,95,230,hoogte);
        g.drawString("Taartpunt met ovaal eromheen",635,230);

        //teken cirkel
        g.drawOval(665,250,105,105);
        g.drawString("Cirkel",702,385);
    }
}
