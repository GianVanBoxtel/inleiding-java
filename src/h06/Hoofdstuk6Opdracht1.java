package h06;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk6Opdracht1 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 113;
        b = 4;
        c = 1;
        uitkomst = (a / b) / c;

    }


    public void paint(Graphics g) {
        g.drawString("Jan krijgt €" + uitkomst, 20,20);
        g.drawString("Ali krijgt €" + uitkomst, 20,40);
        g.drawString("Jeannette krijgt €" + uitkomst, 20,60);
        g.drawString("Gian krijgt €" + uitkomst,20,80);
    }
}
