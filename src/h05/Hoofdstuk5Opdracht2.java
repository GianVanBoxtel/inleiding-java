package h05;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk5Opdracht2 extends Applet {

    int gh;
    int gj;
    int gv;

    public void init() {
        setBackground(Color.white);
        gh = 110;
        gj = 140;
        gv = 90;
    }


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(600, 400, 100, 400);
        g.drawLine(99, 400, 99, 50);


        //Valerie
        g.setColor(Color.blue);
        g.fillRect(110, 310, 30, gv);
        g.setColor(Color.black);
        g.drawString("Valerie", 110, 415);

        //Jeroen
        g.setColor(Color.red);
        g.fillRect(180, 260, 30, gj);
        g.setColor(Color.black);
        g.drawString("Jeroen", 180, 415);

        //Hans
        g.setColor(Color.green);
        g.fillRect(250, 290, 30, gh);
        g.setColor(Color.black);
        g.drawString("Hans", 250, 415);

        //Verdeling van de schaal
        g.drawString("0", 75, 400);
        g.drawString("20", 75, 380);
        g.drawString("40", 75, 360);
        g.drawString("60", 75, 340);
        g.drawString("80", 75, 320);
        g.drawString("100", 75, 300);
        g.drawString("120",75,280);
        g.drawString("140",75,260);
        g.drawString("160",75,240);

    }
}
