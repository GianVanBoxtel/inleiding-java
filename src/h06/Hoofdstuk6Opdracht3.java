package h06;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk6Opdracht3 extends Applet {
    int waarde1;
    int waarde2;
    int uitkomst;

    public void init() {
        waarde1 = 60;
        waarde2 = 48;
        uitkomst = waarde1 + waarde2;
    }

    public void paint(Graphics g) {
        g.drawString("Uitkomst is: -" + uitkomst, 20,20);
    }
}
