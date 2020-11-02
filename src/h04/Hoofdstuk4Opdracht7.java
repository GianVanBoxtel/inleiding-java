package h04;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4Opdracht7 extends Applet {


    public void init() {
        setBackground(Color.gray);

    }


    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRoundRect(50,50,120,120,20,20);
        g.setColor(Color.black);
        g.fillOval(60,60,40,40);
        g.fillOval(120,60,40,40);
        g.fillOval(60,120,40,40);
        g.fillOval(120,120,40,40);

    }
}
