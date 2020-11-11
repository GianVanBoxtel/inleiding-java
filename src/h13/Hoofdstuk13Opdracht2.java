package h13;

import java.awt.*;
import java.applet.*;
public class Hoofdstuk13Opdracht2 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        for (int muur = 0; muur < 25; muur++) {
            for (int muur1 = 0; muur1 < 25; muur1++) {
                tekenBakstenenMuur(g,muur * 22 + 10 * (muur1 % 2), muur1 * 12);
            }
        }


    }


    public void tekenBakstenenMuur(Graphics g, int x1, int y1) {
        g.setColor(Color.red);
        g.fillRect(x1, y1, 20, 10);
    }

}
