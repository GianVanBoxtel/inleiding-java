package h04;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4PraktijkOpdracht extends Applet {


    public void init() {
        setBackground(Color.white);
    }


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(300,50,50,50);
        g.drawString("Lijn", 155,75);

        g.drawRect(50,95,250,100);
        g.drawString("Rechthoek",140,230);

        g.drawRoundRect(50,250,250,100,30,30);
        g.drawString("Afgeronde rechthoek",115,385);

        g.setColor(Color.magenta);
        g.fillRect(330,95,250,100);
        g.setColor(Color.black);
        g.drawOval(340,95,230,100);
        g.drawString("Gevulde rechthoek met ovaal",380,230);

        g.setColor(Color.magenta);
        g.fillOval(340,250,230,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",415,385);

        g.setColor(Color.magenta);
        g.fillArc(626,93,206,120,0,45);
        g.setColor(Color.black);
        g.drawOval(600,95,230,100);
        g.drawString("Taartpunt met ovaal eromheen",635,230);

        g.drawOval(665,250,105,105);
        g.drawString("Cirkel",702,385);
    }
}
