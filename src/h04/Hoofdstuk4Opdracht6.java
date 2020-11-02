package h04;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4Opdracht6 extends Applet {


    public void init() {
        setBackground(Color.white);
    }


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(50,50,15,300);
        g.setColor(Color.gray);
        g.fillOval(27,27,60,140);
        g.setColor(Color.red);
        g.fillOval(40,40,35,35);
        g.setColor(Color.yellow);
        g.fillOval(40,80,35,35);
        g.setColor(Color.green);
        g.fillOval(40,120,35,35);
    }
}
