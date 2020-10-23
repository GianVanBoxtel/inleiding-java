package h02;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk2Opdracht2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Gian", 50, 60);
        g.setColor(Color.red);
        g.drawString("van Boxtel", 50, 70);
    }
}

