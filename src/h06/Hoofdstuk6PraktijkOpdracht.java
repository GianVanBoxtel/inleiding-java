package h06;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk6PraktijkOpdracht extends Applet {
    double EersteCijfer;
    double TweedeCijfer;
    double DerdeCijfer;
    double TotaleCijfer;
    int Gemiddelde;
    double GemiddeldEinde;


    public void init() {
        EersteCijfer = 5.9;
        TweedeCijfer = 6.3;
        DerdeCijfer = 6.9;
        TotaleCijfer = (EersteCijfer + TweedeCijfer + DerdeCijfer) / 3;
        Gemiddelde = (int) (TotaleCijfer * 10);
        GemiddeldEinde = (double) Gemiddelde / 10;

    }


    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is:" + GemiddeldEinde,20,20);

    }
}
