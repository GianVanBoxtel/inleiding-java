package h11;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk11Opdracht3 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 30;
        int z = 1;
        for (int i = 1; i < 30; i += z) {
            g.drawString("" + i, x, y);
            x += 20;
            z++;
        }
    }
}
