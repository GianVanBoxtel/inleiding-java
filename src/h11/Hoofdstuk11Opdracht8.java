package h11;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk11Opdracht8 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int i = 0;
        int x = 0;
        int y = 0;
        int width = 10;
        int height = 10;
        while (i <= 500)
        {

            g.drawOval(x, y, width, height);
            width += 10;

            height += 10;
            i++;
        }
    }
}
