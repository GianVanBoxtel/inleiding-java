package h11;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk11Opdracht5 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;

        for (teller = 1; teller <= 5; teller++) {
            y += 20;
            x += 20;
            g.drawRect(x, y,20,20);
        }
    }
}
