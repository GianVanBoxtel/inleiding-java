package h11;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk11Opdracht4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        for (int drie = 3; drie < 33; drie += 3) {
            g.drawString("" + drie, x, y);
            x += 20;
        }
    }
}
