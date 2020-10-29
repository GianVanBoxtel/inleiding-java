package h04;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4Opdracht4 extends Applet {


    public void init() {
        setBackground(Color.white);
    }


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(600, 400, 100, 400);
        g.drawLine(99, 400, 99, 50);


        //Valerie
        g.setColor(Color.blue);
        g.fillRect(110, 350, 30, 50);
        g.setColor(Color.black);
        g.drawString("Valerie", 110, 415);

        //Jeroen
        g.setColor(Color.red);
        g.fillRect(180, 290, 30, 110);
        g.setColor(Color.black);
        g.drawString("Jeroen", 180, 415);

        //Hans
        g.setColor(Color.green);
        g.fillRect(250, 310, 30, 90);
        g.setColor(Color.black);
        g.drawString("Hans", 250, 415);

        //Verdeling van de schaal
        g.drawString("0", 75, 400);
        g.drawString("20", 75, 380);
        g.drawString("40", 75, 360);
        g.drawString("60", 75, 340);
        g.drawString("80", 75, 320);
        g.drawString("100",75,300);
    }
}
