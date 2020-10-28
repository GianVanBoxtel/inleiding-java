package h04;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4Opdracht2 extends Applet {

    public void init() {
        setBackground(Color.gray);
    }


    public void paint(Graphics g) {

        //vorm huis
        g.setColor(Color.red);
        g.drawRect(50,200, 400, 300);

        //dak
        g.drawLine(50, 200, 250, 100);
        g.drawLine(450, 200, 250,100);

        //deur
        g.drawRect(340, 360,70,140);

        //raam
        g.drawRect(100,370,130,60 );

    }
}
