package h04;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk4Opdracht3 extends Applet {


    public void init() {
        setBackground(Color.gray);
    }


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(50,50,5,300);

        g.setColor(Color.red);
        g.fillRect(55,50,200,50);

        g.setColor(Color.white);
        g.fillRect(55,100,200,50);

        g.setColor(Color.blue);
        g.fillRect(55,150,200,50);
    }
}
