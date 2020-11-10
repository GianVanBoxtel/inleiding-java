package h11;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk11Opdracht1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;

        while(teller < 10) {
            x += 20;
            g.drawLine(x , 250, x, 50 );
            g.drawString("" + teller, x, 265 );
            teller++;
        }

    }
}
