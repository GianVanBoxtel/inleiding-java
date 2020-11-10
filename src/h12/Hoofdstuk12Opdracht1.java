package h12;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk12Opdracht1 extends Applet {
    int[] nummers = {1,2,3,4,5,10,1,50,25};


    public void init() {

    }

    public void paint(Graphics g) {
       int x = getWidth();
       int y = getHeight();
       double gemiddelde = 0.0;

       for (int i = 0; i < nummers.length; i++) {
           g.drawString("" + nummers[i], x / 2, (y / 2 - 15 * nummers.length / 2) + 15 * i);
           gemiddelde += nummers[i];
       }
       gemiddelde /= nummers.length;
       g.drawString("Het gemiddelde is " + gemiddelde, x / 2 - 50, (y / 2 + 15 * nummers.length / 2) + 10);
    }
}
