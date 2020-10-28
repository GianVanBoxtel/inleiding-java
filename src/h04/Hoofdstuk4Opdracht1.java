package h04;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4Opdracht1 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawLine(50,200,150,50);
        g.drawLine(50,200,250,200);
        g.drawLine(250,200,150,50);
    }
}
