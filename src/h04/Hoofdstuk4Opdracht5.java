package h04;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4Opdracht5 extends Applet {


    public void init() {
        setBackground(Color.blue);
    }


    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(20,20,50,100);
    }
}
